//continue
//for example there's null variable in a list, we could skill taht nullable value with
//continue!
fun main() {
    val listt = listOf(1,2,null,3,4)
    for (i in listt){
        if (i==null) {
            continue
        }
            println("$i")

    }
}


/*fun main() {
    val listt = listOf(1,2,null,3,4)
    for (i in listt){
        if (i==null) {
            break
        }
            println("$i")

    }
}*/



//we also could use @ for foobar and bar@ idk what does this mean
//but basically it's like html class or placeholder
/*fun main() {
    loop@ for (i in 1..10) {
        println("Outside Loop")
        break@loop
    }
}*/