//normal class
class user(val name:String, val age:Int)

//data class
    data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    val user = user("nama",10)
    val datauser = dataUser(name = "nama", age = 10)
    //we could copy the dataClass
    val dataUser2 = datauser.copy()
    //we also could copy then modify the value
    val dataUser3 = datauser.copy(age=11)
    println(user)
    print(datauser)
    println(dataUser2)
    println(dataUser3)




}