abstract class Animal(val name: String) {
    // Abstract property to be overridden by subclasses
    abstract val legs: Int
    
    // Abstract method to be overridden by subclasses
    abstract fun makeSound(): String
}

class Dog(name: String) : Animal(name) {
    // Override the property
    override val legs: Int = 4
    
    // Override the method
    override fun makeSound(): String {
        return "woof"
    }
}

class Cat(name: String) : Animal(name) {
    // Override the property
    override val legs: Int = 4
    
    // Override the method
    override fun makeSound(): String {
        return "meow"
    }
}

fun main() {
    // Creating instances of the concrete subclasses
    val buddy = Dog("the buddy")
    val whiskers = Cat("whiskers")
    
    // Creating a list of animals
    val animals = listOf(buddy, whiskers)
    
    // Creating a list of words/sentences as requested
    val words = mutableListOf<String>()
    
    // Iterate over the animals and construct the sounds
    for (animal in animals) {
        words.add("${animal.name} says ${animal.makeSound()}")
    }
    
    // Print each sound, joining them to match the expected outcome
    println(words.joinToString(" and "))
}
