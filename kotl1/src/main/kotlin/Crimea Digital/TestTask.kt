package `Crimea Digital`

fun main(){

    val displayName = "Ivar Johnson Jacobson 35 years old"
    val displayNameList = displayName.split(" ")

println("Имя - ${displayNameList.elementAt(0)} \n" +
        "Фамилия - ${displayNameList.elementAt(2)} \n" +
        "Возраст - ${displayNameList.elementAt(3)} лет")

}