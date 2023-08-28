data class dataUser(val name:String, val age:Int)


fun main() {
    //we could get a value of a dataClass using component
    val user = dataUser("nama",17)

    val nama = user.component1()
    val age = user.component2()

    //we could also do this
    val (nama2, age2) = user//this will create 2 variable: nama2 & age2 the value will be copied from user
    println("my name is $nama and I am $age years old")


}