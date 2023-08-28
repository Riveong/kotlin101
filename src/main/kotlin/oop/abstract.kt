//make abstract class (a class that can't become objects. It needs interface
abstract class animalAbstract(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}









fun main() {
    //can't make instace because of abstract class
    //animalAbstract("as")
}
