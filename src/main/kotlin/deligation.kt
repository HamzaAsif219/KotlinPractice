/*interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(e: Base) : Base by e

fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
}*/


interface Downloader{
    fun Download()
}
interface Uploader{
    fun Upload()
}
class VedioDownloader(var filename:String):Downloader{
    override fun Download() {
        println("file name : $filename is downloaded")
    }
}
class VedioUploader(var filename: String):Uploader{
    override fun Upload() {
        println("File name : $filename is Uploaded")
    }
}
class Filerhandler(var downloaded:Downloader, var uploaded:Uploader):Downloader by downloaded,Uploader by uploaded{
//    override fun Download() {
//        println("Hello Downloader from fileHandler")
//    }
//
//    override fun Upload() {
//       uploaded.Upload()
//    }
}

fun main(){
    var upload=VedioUploader("uploaded")
    var download=VedioDownloader("Download")


//    upload.Upload()
//    download.Download()

    var filehandler=Filerhandler(download,upload)
    filehandler.Download()
    filehandler.Upload()
}









/*
interface Base {
    fun printMe() //abstract method
}


class BaseImpl(val x: Int) : Base {
    override fun printMe() { println(x) }   //implementation of the method
}
class Derived(b: Base) : Base by b  // delegating the public method on the object b

fun main() {
    val b = BaseImpl(15)
    Derived(b).printMe() // prints 10 :: accessing the printMe() method

}


 */