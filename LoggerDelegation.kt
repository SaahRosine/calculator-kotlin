interface Logger {
    fun log(message: String)
}

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println(message)
    }
}

class FileLogger : Logger {
    override fun log(message: String) {
        println("File: $message")
    }
}

class Application(logger: Logger) : Logger by logger

fun main() {
    val app = Application(ConsoleLogger())
    app.log("App started") // prints to console

    val fileApp = Application(FileLogger())
    fileApp.log("Error occurred") // "File: Error occurred"

    println("Delegation makes it easy to swap implementations without changing the class.")
}
