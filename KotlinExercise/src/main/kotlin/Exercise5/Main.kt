package Exercise5

//Write an extension method that filters a list by value (e.g. smaller than 500).
//Write an extension method that prints list values.
//Then create a list that that has at least 10 members,
//filter them and then print the values that pass the filter.

fun main() {
    var listOfTenNumbers = listOf<Int>(333, 555, 666, 777, 345, 222, 425, 999, 888, 678)
    listOfTenNumbers.filterSmallNumbers().printInt()
}

fun List<Int>.filterSmallNumbers(): List<Int> {
    return this.filter { it > 500 }

}

fun List<Int>.printInt(){
    return this.forEach { println(it) }
}
