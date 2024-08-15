class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice

) {

    var deviceTurnOnCount = 0


    fun turnOnTv() {
        if(smartTvDevice.deviceStatus != "on"){
                smartTvDevice.turnOn()
            deviceTurnOnCount++
            }else{
                println("El ${smartTvDevice.name} esta prendido")
        }
    }

    fun turnOffTv() {
        if(smartTvDevice.deviceStatus == "on"){
            smartTvDevice.turnOff()


        }else{
            println("El ${smartTvDevice.name} ya esta apagado")
        }

    }
    fun increaseTvVolume() {
        if(smartTvDevice.deviceStatus == "on"){
            smartTvDevice.increaseSpeakerVolume()
        }else{
            println("El ${smartTvDevice.name} deve estar prendido")
        }
    }

    fun changeTvChannelToNext() {
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.nextChannel()
        }else{
            println("El ${smartTvDevice.name} deve estar prendido para aumentar el volumen")
        }
    }

    fun turnOnLight() {
        if (smartLightDevice.deviceStatus != "on"){
            smartLightDevice.turnOn()
            deviceTurnOnCount++
        }
    }

    fun turnOffLight() {
        if(smartLightDevice.deviceStatus == "of"){
            smartLightDevice.turnOff()
        }
    }
    fun increaseLightBrightness() {
        if (smartLightDevice.deviceStatus == "on"){
            smartLightDevice.increaseBrightness()
        }else{
            println("el ${smartLightDevice.name} esta apagado")
        }
    }
    fun turnOffAllDevices() {
        if (smartTvDevice.deviceStatus == "on" && smartLightDevice.deviceStatus == "on"){
            turnOffTv()
            turnOffLight()
        }

    }
    // new methods for chanllenge

}
