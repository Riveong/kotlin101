//this is an extension in oop
class animalEP(var name: String,var Age: Int)
    val animalEP.getInfo: String
    get() = "Info: Nama = ${this.name}"


fun main() {
    val anu = animalEP("jamal",10)
    println(anu.getInfo)
}


