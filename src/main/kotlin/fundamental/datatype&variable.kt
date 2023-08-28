package fundamental

fun main() {
    /*

    # how to declare
    var identifier: Type = initialization

    # example
    var name: String = "example"
    var name: Int = 2
    var name: boolean = True
    
    */

    var name: String = "Gabriel"
    val angka: Int = 10
    val angka2: Int = 20
    var vocal: Char = 'A'
    var chari: Char = vocal++

    println(angka+angka2)
    print(chari)
    print(chari++)
    print(chari--)
    println(name)
    for (i in name){
        print("$i")
    }


    //looking for string index bla bla bla
    val text = "Kotlin"
    val firstChar = text[0]

    for (i in text){
        print("$i")
    }
    print(firstChar)


    val statement = "kotlin is  \"Awesome!\""
    println(statement)

    /*
    \t: menambah tab ke dalam teks.

    \n: membuat baris baru di dalam teks.

    \’: menambah karakter single quote kedalam teks.

    \”: menambah karakter double quote kedalam teks.

    \\: menambah karakter backslash kedalam teks.
     */

    name = "Unicode test: \u00A9"

    println(name)

    //trim indent
    val line = """
        Line1
        Line2
        Line3
    """.trimIndent()

    print(line)


}