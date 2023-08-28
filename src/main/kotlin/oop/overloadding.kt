//we can make overload for function:
class animalOverload(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val meong = animalOverload("miaw")
    meong.eat()
    meong.eat("whiskas")
    meong.eat("whiskas",20.0)
}