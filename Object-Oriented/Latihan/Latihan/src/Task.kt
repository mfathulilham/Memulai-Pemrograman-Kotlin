// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
    get() {
        println("Fungsi getter dipanggil")
        return field
    }
    set(name) {
        println("Fungsi setter dipanggil")
        field = name
    }
    fun toSleep() {
        if (sleep == true)
            println("$name, sleep!")
        else println("$name, let's play!")
    }
}

fun main() {
    // TODO 2
    val animal = Cat("Gippy")

    animal.toSleep()
    animal.sleep = true
    animal.toSleep()
}