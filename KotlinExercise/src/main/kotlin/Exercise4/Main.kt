package Exercise4

//Create a list of integers, transform it into a list of strings, and print them one by one

fun main() {

    var listOfInt = listOf<Int>(1, 2, 3, 4, 5)
    listOfInt.map { it.toString() }.forEach { println(it) }
}