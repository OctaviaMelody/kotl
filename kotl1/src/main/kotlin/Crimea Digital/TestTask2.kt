package `Crimea Digital`
fun main(){
    val taskList = listOf<String>("Apple","Banana","Orange","100","KIWI","Tire")
    val compareListofFruits = listOf<String>("Peach","Melon","Pear","Kiwi","Apple","Orange","Avocado","Tangerine","Fig","Banana")
    var resultList = emptyList<String>()
    for(i in 0..taskList.size-1) {
        for (item in 0..compareListofFruits.size-1) {
            if (taskList.elementAt(i).lowercase() == compareListofFruits.elementAt(item).lowercase()) {
                resultList += taskList.elementAt(i)
            }
        }
    }
    println(resultList)
}