import kotlin.reflect.typeOf
fun getRandomString(length: Int) : String {
    val charset = "0123456789"
    return "+" + (2..length)
        .map { charset.random() }
        .joinToString("")
}

fun getRandomName() : String {
    val charset = listOf<String>("Alex", "Drago", "Sinegal","Oper","Judas","Anatoly","Danik")
    return  charset.random()
}

fun getRandomLastName() : String {
    val charset = listOf<String>("Chernov", "Pavlov", "Durov","Krylov","Ikhas","Vaserman",
        "Loh")
    return  charset.random()
}


fun phonenum(): MutableList<String>{
    println("Введите число: ")
    var i = 0
    var num : Int = Integer.valueOf(readLine())
    var phonemap = mutableMapOf<String,String>()
    while (num < 1){
        println("Ошибка:Число меньше 1")
        println("Введите число заново")
        num = Integer.valueOf(readLine())
    }
    val phonenumber1 : String = "+7945555777"
    val phonenumber2 : String = "+7918555777"
    var phonelist : MutableList<String> = mutableListOf()
    phonelist.add(phonenumber1)
    phonelist.add(phonenumber1)

    for (item in i..num-1) {
        var phonenumber = getRandomString(11)
        var phonename = getRandomName()
        var phonelastname = getRandomLastName()
        phonename = phonename + " " + phonelastname
        phonelist.add(phonenumber)
        phonemap.put(phonenumber,phonename)
        i++
    }

    println(phonelist.filter{s -> s.subSequence(0,2)== "+7"})

    var phoneset = phonelist.toSet()
    println("Количество уникальных номеров: "
            + phoneset.count())
    i = 0
    var test : MutableList<Int> = mutableListOf()
    for(item in i..phoneset.size){
        var wordlength = phoneset.elementAt(i).length
        test.add(wordlength)

    }
    var sumofset = 0
    sumofset += phonelist.sumOf { index -> index.length }
    println("Сумма длин всех имеющихся номеров: " + test.sumOf { it } )
    println("Сумма длин всех уникальных номеров: " + (sumofset) )

    var index = ""
    var value = ""
    phonemap = phonemap.toSortedMap()
    phonemap.forEach { (key, value) ->
        println("Номер мобилы: $key, Имя абонента: $value")
    }


    return phonelist
}




fun main(){
phonenum()

}