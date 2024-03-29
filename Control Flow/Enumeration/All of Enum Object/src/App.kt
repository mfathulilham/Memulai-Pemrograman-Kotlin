// main function
fun main() {
    val color : Array<Color> = Color.values()
    color.forEach { color ->
        println(color)
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}