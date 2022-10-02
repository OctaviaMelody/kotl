    fun heighttest() {
        var firstName = "Octavia"
        var lastName = if (firstName == "Octavia") "Melody" else null
        var height = 177.0
        var weight = 69
        var isChild = if (height <= 150.0 || weight <= 40.0) "Вы ребенок, позор" else "Вы не ребенок, респект"
        var info = "Ваш рост = $height, Вес = $weight, А ща чекнем ребенок ли ты: $isChild "
        var info2 = "Вы - $firstName $lastName"
        println(info2 + "\n" + info)
        height = 129.0
        weight = 60
        isChild = if (height <= 150.0 || weight <= 40.0) "Вы ребенок, позор" else "Вы не ребенок, респект"
        info = "Ваш рост = $height, Вес = $weight, А ща чекнем ребенок ли вы: $isChild "
        info2 = "Вы - $firstName $lastName"
        println(info2 + "\n" + info)
    }

    fun main() {
        heighttest()

    }
