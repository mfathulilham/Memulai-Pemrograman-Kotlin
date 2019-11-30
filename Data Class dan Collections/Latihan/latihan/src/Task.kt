
fun main() {
    // TODO 1
    val user = mapOf<String , String>(
            "user" to "User",
            "Name" to "Name: John",
            "Age" to "Age: 23",
            "Address" to "Address: St. Petersburg"
    )

    // TODO 2
    val name = user.getValue("Name")
    val age = user.getValue("Age")
    val address = user.getValue("Address")

    // TODO 3
    println(user.getValue("user"))
    println(name)
    println(age)
    println(address)
}
