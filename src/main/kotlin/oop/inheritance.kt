 open class animalInheritance(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }

     open fun aaaa(){
         println("TERIAK AAAAAAAAAAAAA")


     }
}


 class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
     : animalInheritance(pName, pWeight, pAge, pIsCarnivore) {

     fun playWithHuman() {
         println("$name bermain bersama Manusia !")
     }
    //override to override the parent function
     override fun eat(){
         println("$name sedang memakan ikan !")
     }

     override fun sleep() {
         println("$name sedang tidur di bantal !")
     }
 }

 fun main() {
     val meow=Cat("meong",80.0,80,true,"Red",4)
     meow.aaaa()


 }