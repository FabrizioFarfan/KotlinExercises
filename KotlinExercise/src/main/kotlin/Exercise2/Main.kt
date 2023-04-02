package Exercise2

fun main(){
//    Write two different implementations of 1 parent and 2 children classes that
//    override one method - one using inheritance and another using interfaces.

    // Two different implementations of "ParentClass"
    val implementation = ParentClass()
    val implementation2 = ParentClass()
    implementation.printNameWithClass("Mark")
    implementation2.printNameWithClass("Rick")

    // Two children classes that override one method
    val childInterface = ChildtByInterface()
    val childInterface2 = ChildtByInterface2()
    childInterface.printNameWithInterface("Jhon")
    childInterface2.printNameWithInterface("Sam")
}


interface ParentInterface {
    fun printNameWithInterface(name: String)
}

class ChildtByInterface : ParentInterface {
    override fun printNameWithInterface(name: String) {
        println("My name is $name")
    }
}
class ChildtByInterface2 : ParentInterface {
    override fun printNameWithInterface(name: String) {
        println("My name is $name and this is the same fun working different")
    }
}


class ParentClass {
    fun printNameWithClass(name: String) = println("Hi my name is $name")
}