

fun pizdec(string: String){
    var x = 0
    var num = string.length / 2
    var str2 = string.removeRange(num, string.length)
    var str1 = string.removeRange(0, num)
    var chars1: MutableList<Char> = str1.toMutableList()
    var chars2: MutableList<Char> = str2.toMutableList()
    var charsIndex = chars1.indexOf(chars1.find{it == '0'})
    chars1.set(charsIndex, 'o')
    str1 = chars1.joinToString("")
    var shiftedString = str1.map {char -> char + 3}.joinToString("")
    chars1 = str1.toMutableList()


    print(shiftedString)











    /*while (x < str1.length ){
        chars1.set(x, chars1.get(x)+3)
    x++
    }

    do{
        charsIndex = chars1.indexOf(chars1.find { it == '4' })
        if(charsIndex == -1 )break else{
            chars1.set(charsIndex, 'u')
            charsIndex = 11
        }
    }while(charsIndex != -1)
    do{
        charsIndex = chars1.indexOf(chars1.find { it == '5' })
        if(charsIndex == -1 )break else{
        chars1.set(charsIndex, 's')
        charsIndex = 11
            }
    }while(charsIndex != -1)

    x = 0
    while ( x < str1.length ){
        chars1.set(x, chars1.get(x)-1)
        x++
    }*/




/*    println(str1)
    println(str2)*/


}



fun main() {
    var str1 = "F2p)v\"y233{0->c}ttelciFc"
    //var str2 = "Snakebite enter my veins"
    pizdec(str1)
    //pizdec(str2)

}