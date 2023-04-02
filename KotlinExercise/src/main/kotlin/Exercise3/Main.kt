package Exercise3

//    Write sealed class for a type User that uses data classes for different
//    types: Email, Facebook, Google. They need to each have an id, and optionally password or email.
//    Use them in a when inside a method to return a printable value as String.

fun main(){
    val accessingByEmail = Email("E-mail","MyEmailId","email123")
    val accessingByFacebook = Facebook("Facebook","MyFacebookId","facebook123")
    val accessingByGoogle = Google("Google","MyGoogleId","google123")
    accessing(accessingByEmail)
    accessing(accessingByFacebook)
    accessing(accessingByGoogle)

    //Optional
    println(accessingByEmail.access())

}
fun accessing (accessWith: User) = when(accessWith){
    is Email -> println("email user : $accessWith")
    is Facebook -> println("facebook user : $accessWith")
    is Google -> println("google user : $accessWith")
}


sealed class User(open val type: String, open val id: String, open val password: String){
    fun access(): String {
        return "Accessing by : $type , your Id is : $id and your password is : $password"
    }
}

data class Email(override val type: String, override val id: String, override val password: String) :
    User(type, id, password){}

data class Facebook(override val type: String, override val id: String, override val password: String) :
    User(type, id, password){}

data class Google(override val type: String, override val id: String, override val password: String) :
    User(type, id, password){}