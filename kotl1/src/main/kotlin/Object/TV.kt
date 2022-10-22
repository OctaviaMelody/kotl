class TV(val mark : Int, val model : String,val diagSize : Int) {

    var volume = 0
    var isOn : Boolean = false
    var channel = 0
    var channelMap = channels.channelMap
    val channelQuantity = channels.channelQuantity


    /* private var channelMap = mapOf(1 to channels.getRandomChannel(),2 to channels.getRandomChannel(),3 to channels.getRandomChannel(),
         4 to channels.getRandomChannel(),5 to channels.getRandomChannel(),
         6 to channels.getRandomChannel() ,7 to channels.getRandomChannel(),8 to channels.getRandomChannel(),
         9 to channels.getRandomChannel(),10 to channels.getRandomChannel())*/


    fun onOff():Boolean{
        println("Включить ТВ?")
        var answer : String? = readLine()
        if(answer == "Да" || answer == "да" || answer == "Da" || answer == "da" || answer == "Yes"|| answer == "yes"){isOn = true}
        else {isOn}
        return isOn
    }

    fun volumeUp(num: Int){
        if(num >= 0) {
            if (volume + num < maxminVolume.maxVolume) {
                println(volume)
                volume += num
            } else  {
                volume = maxminVolume.maxVolume
            }
            println(volume)
        }
    }

    fun volumeDown(num: Int): Int{
        if(volume - num > 0) {
            if (num > maxminVolume.minVolume) {
                volume -= num
            }
        }else {
            volume = maxminVolume.minVolume
        }
        println(volume)
        return volume
    }

    fun channelSwitch(num : Int): String{
        if(isOn == false){isOn = true}
        val key = channelMap.keys.elementAt(num-1)
        println("Вы нажали на кнопку $num")
        println("Номер канала: $key, Название: ${channelMap.getValue(num)}")
        return channelMap.getValue(num)
    }

    public fun channelNext(): String{
        if(isOn == false){isOn = true}
        if (channel >= 0 ) channel++
        if (channel > channelQuantity) channel = 1
        val key = channelMap.keys.elementAt(channel-1)
        println("Вы нажали на кнопку вперед")
        println("Номер канала: $key, Название: ${channelMap.getValue(channel)}")
        return channelMap.getValue(channel)
    }
    fun channelPrevious(): String{
        if(isOn == false){isOn = true}
        if (channel >= 0 ) channel--
        if (channel == 0) channel = channelQuantity
        val key = channelMap.keys.elementAt(channel-1)
        println("Вы нажали на кнопку назад")
        println("Номер канала: $key, Название: ${channelMap.getValue(channel)}")
        return channelMap.getValue(channel)
    }

    object channels{
        /*        private var channelMap = mapOf(1 to getRandomChannel(),2 to getRandomChannel(),3 to getRandomChannel(),4 to getRandomChannel(),5 to getRandomChannel(),
                    6 to getRandomChannel() ,7 to getRandomChannel(),8 to getRandomChannel(),9 to getRandomChannel(),10 to getRandomChannel())*/
        var channelMap = mutableMapOf<Int, String>()
        var channelQuantity = 0
        fun getRandomChannel(): String {
            val charset = listOf<String>("Россия24", "Россия23", "ВГТРК","Опер","НТВ","ТВ3","ТНТ","ТПФП","РОН","ВРАЦ","ТОПОЛЬ","СПАС","Кроль","Сева","Пон")
            return  charset.random()
        }
        public fun mapSet(channelQuantityTemp : Int) :Int{
            for(i in 1..channelQuantityTemp){
                channelMap.put(i,channels.getRandomChannel())
            }
            channelQuantity = channelQuantityTemp
            return channelQuantity
        }

    }

    companion object maxminVolume{
        const val maxVolume: Int = 100
        const val minVolume: Int = 0
    }

}