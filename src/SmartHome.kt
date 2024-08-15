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
        if(smartLightDevice.deviceStatus == "on"){
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
            println("Apagaste todos los dipositivos, Adio vuelva pronto")
        }

    }
    // new methods for chanllenge
    fun decreaseTvVolume(){
        if(smartTvDevice.deviceStatus == "on" ){
            smartTvDevice.decreaseVolume()
        }else{
            println("Tienes que enceder el dipositivo o  ")
        }

    }
    fun changeTvChannelToPrevious(){
        if(smartTvDevice.deviceStatus == "on"){
            smartTvDevice.formerChannel()
        }

    }

    fun printSmartTvInfo(){
        if (smartTvDevice.deviceStatus == "on"){
            println("Nombre el equipo: ${smartTvDevice.name} \n" +
                    "Estado del equipo: ${smartTvDevice.deviceStatus} \n" +
                    "Estado actual de volumen: ${smartTvDevice.speakerVolume} \n" +
                    "Estado actual del canal:  ${smartTvDevice.channelNumber}")

        }
    }
    fun printSmartLightInfo(){
        if (smartLightDevice.deviceStatus == "on"){
            println("Nombre el equipo: ${smartLightDevice.name} \n" +
                    "Estado del equipo: ${smartLightDevice.deviceStatus} \n" +
                    "Estado actual de Nivel de brillo: ${smartLightDevice.brightnessLevel}"
            )
        }
    }
    fun decreaseLightBrightness(){
        if(smartLightDevice.deviceStatus == "on" ){
            smartLightDevice.decreaseBrightness()
        }else{
            println("Tienes que encender el dispositivo")
        }
    }

}
