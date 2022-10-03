fun Fibbonacci() {
    var numFib1 = 0
    var numFib2 = 1
    println("Введите какое хотите число получить")
    val num:Int = Integer.valueOf(readLine())
    if (num < 0){
        println ("Введите значение заново")
        println ("Программа завершится если снова введете число < 0")
        println("Введите какое хотите число получить")
        val num:Int = Integer.valueOf(readLine())}
    else if (num > 0) {
        var i = 0
        while (i < num - 2) {
            var fib_sum = numFib1 + numFib2
            numFib1 = numFib2
            numFib2 = fib_sum
            i++
        }
        print("Значение $num элемента - $numFib2")
    }else print("Значение $num элемента - $numFib1")
}


fun main() {
    Fibbonacci()
}