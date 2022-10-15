
fun getRandomString(length: Int) : String {
    val charset = "0123456789"
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}

fun phonenum(): MutableList<String>{
println("Введите число: ")
    var i = 0
    var num : Int = Integer.valueOf(readLine())
    while (num < 1){
        println("Ошибка:Число меньше 1")
        println("Введите число заново")
        num = Integer.valueOf(readLine())
    }
    val phonenumber1 : String = "+794555577722"
    val phonenumber2 : String = "+791855577721"
    var phonelist : MutableList<String> = mutableListOf()

println(num)
        for (item in i..num-1) {
            var phonenumber = getRandomString(11)
            println(phonenumber)
            phonelist.add(phonenumber)
            i++
        }
    phonelist.add(phonenumber1)
    phonelist.add(phonenumber2)
    println(phonelist.filter{s -> s.subSequence(0,2)== "+7"})
    return phonelist
}


fun main(){
phonenum()

}