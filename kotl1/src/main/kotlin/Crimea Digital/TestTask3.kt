package `Crimea Digital`

data class User(var age: Int?, var name: String?){

    fun changeAge(num: Int){
        age = num
    }

    fun changeName(string: String){
        name = string
    }

    fun printUser(){
        if (age != null && name != null)
        println("$name has accepted your invitation, the age of $name is $age")
        else println("N/A has accepted your invitation, the age of N/A is N/A")
    }




}
fun main(){
    var testUser = User(12,"Crazy")
    println(testUser)
    testUser.changeAge(19)
    println(testUser)
    testUser.changeName("Fool")

    println(testUser)
    testUser.printUser()

    testUser = User(null,null)
    println(testUser)
    testUser.printUser()

}