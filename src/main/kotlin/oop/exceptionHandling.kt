//handling the errors!
fun main() {
    val someNullValue: String? = null //make a null variable
    lateinit var someMustNotNullValue: String //not sure will use or no

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }
}



/*fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }
}
*/


/*
try{
    // Block try, menyimpan kode yang membangkitkan exception
} catch (e: NullPointerException) {
    // Block catch akan terpanggil ketika terjadi NullPointerException.
} catch (e: NumberFormatException) {
    // Block catch akan terpanggil ketika terjadi NumberFormatException.
} catch (e: Exception) {
    // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
}
finally {
    // Block finally akan terpanggil setelah keluar dari block try atau catch
}*/