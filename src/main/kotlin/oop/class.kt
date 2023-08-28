class Animal (var name: String, val weight: Int, val age: Int, val isMamal: Boolean){
    fun eat(){
        println("nom nom")

    }

    fun roar(){
        println("$name is meowing!")
    }



}


class alatMasak (var name: String, val bahan: String){
    fun pakai(){
        println("njir rusak")


    }




}





fun main() {
    val meowmeow = Animal("meow1",20,5,true)
    meowmeow.eat()
    meowmeow.roar()
    meowmeow.isMamal
    println("data of the meow meow: ${meowmeow.name}${meowmeow.isMamal}")
}