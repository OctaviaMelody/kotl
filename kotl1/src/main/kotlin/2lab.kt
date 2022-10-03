

fun shift (string: String, num: Int): String{
    string.map { char -> char + num }.joinToString("")
    return string
}

fun cipher(string: String) {
    var num = string.length / 2
    var str2 = string.removeRange(0, num)
    var chars2: MutableList<Char> = str2.toMutableList()
    var charsIndex2 = chars2.indexOf(chars2.find { it == ' ' })
    var str1 = string.removeRange(num, string.length)
    var chars1: MutableList<Char> = str1.toMutableList()
    var charsIndex = chars1.indexOf(chars1.find { it == '0' })
    if (charsIndex > -1) {chars1.set(charsIndex, 'o')}
    str1 = chars1.joinToString("")
    str1 = str1.map { char -> char + 3 }.joinToString("")
    chars1 = str1.toMutableList()

    do {
        charsIndex = chars1.indexOf(chars1.find { it == '4' })
        if (charsIndex == -1) break else {
            chars1.set(charsIndex, 'u')
            charsIndex = 11
        }
    } while (charsIndex != -1)
    do {
        charsIndex = chars1.indexOf(chars1.find { it == '5' })
        if (charsIndex == -1) break else {
            chars1.set(charsIndex, 's')
            charsIndex = 11
        }
    } while (charsIndex != -1)
    str1 = chars1.map { char -> char - 1 }.joinToString("")



    do {
        charsIndex2 = chars2.indexOf(chars2.find { it == ' ' })
        if (charsIndex2 == -1) break else {
            chars2.set(charsIndex2, '_')
            charsIndex2 = 11
        }
    } while (charsIndex2 != -1)
    //str2 = chars2.joinToString("")
    str2 = chars2.map { char -> char + 4 }.joinToString("")
    //str2 = shift(str2,4) попробовал сделать но забил хрен

    println(str1.reversed() + str2.reversed())
}



fun main() {
    var str1 = "F2p)v\"y233{0->c}ttelciFc"
    var str2 = "Snakebite enter my veins"
    cipher(str1)
    cipher(str2)


}