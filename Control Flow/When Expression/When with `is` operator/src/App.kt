// main function
fun main() {
    val anyType : Any = 100L
    val any : Any =
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}