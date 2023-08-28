fun fullName(first: String = "this", middle: String = "default", last: String = "value"):String{
    return "$first,$middle,$last"



}


fun main() {
    println(fullName(first = "gabriel", middle = "rive", last="rine"))
    //we could also print with unordered schema:
    println(fullName(last = "rine", middle = "rive", first = "gabriel"))
}