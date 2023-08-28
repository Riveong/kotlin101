data class DsataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val dataUser = DsataUser("nrohmen", 23)
    dataUser.intro()
}