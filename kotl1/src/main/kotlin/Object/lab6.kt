
fun main() {
    //TV().onOff()
    var TVChannels = TV.channels
    TVChannels.mapSet(13)
    var test = TV(12,"LTID",25)
    //var test1 = TV()


    test.volumeUp(20)
    test.volumeUp(90)
    test.volumeDown(40)
    test.volumeDown(10)
    test.channelSwitch(10)
    test.channelNext()
    test.channelSwitch(1)
    test.channelPrevious()


    TVChannels.mapSet(13)
    test = TV(134,"LTIDS",22)
}