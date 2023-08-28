package fundamental

//make a null variable
val text:String? = null
val textLength = text?.length ?: 7


//what's really happening on that code: val textLength = if (text != null) text.length else 7