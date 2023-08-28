// we could use init as first function to be used.

class animalCons(name: String, age: Int){
    val name: String
    val age: Int
    init {
        this.name = name
        this.age = age
        println("yoi")
    }






}


fun main() {
    val kelinci = animalCons("Kinci",5)
}