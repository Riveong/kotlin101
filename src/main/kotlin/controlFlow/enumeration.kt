fun main() {
    //example 1
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    println(colorRed)
    println(colorGreen)
    println(colorBlue)

    //example 2
    val subjectMath = Subject.MATH
    val subjectHistory = Subject.HISTORY
    val subjectBiology = Subject.BIOLOGY



}




enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)

}

enum class Subject{
    MATH,HISTORY,BIOLOGY


}


/*
enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}
*/



/*fun main() {
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}*/