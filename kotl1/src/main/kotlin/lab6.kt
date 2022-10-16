class TV {
    var mark : Int = 0
    var model : String = ""
    var diagSize : Int = 0
    var volume = 0
    var isOn : Boolean = false
    var channel = 0
    private var channelQuantity : Int = 10
    companion object maxminVolume{
        const val maxVolume: Int = 100
            const val minVolume: Int = 0
    }

    public fun onOff():Boolean{
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

    fun channelSwitch(num : Int): Int{
        if(isOn == false){isOn = true}
        channel = num
        println(channel)
        return channel
    }

    public fun channelNext(): Int{
        if(isOn == false){isOn = true}
        if (channel >= 0 && channel < channelQuantity) channel++
        println(channel)
        return channel
    }
    fun channelPrevious(): Int{
        if(isOn == false){isOn = true}
        if (channel >= 0 && channel <= channelQuantity) channel--
        println(channel)
        return channel
    }

}
fun main() {
    //TV().onOff()
    var test = TV()
    var test1 = TV()
    test.volumeUp(20)
    test.volumeUp(90)
    test.volumeDown(40)
    test.volumeDown(10)
    test.channelNext()
    test.channelSwitch(8)
    test.channelPrevious()

}