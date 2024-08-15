fun main() {
//    var smartDeviceTV: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
//    smartDeviceTV.turnOn()
//    smartDeviceTV.deviceStatus
//
//    println(smartDeviceTV.name)
//    var smartDeviceLIGHT: SmartDevice = SmartLightDevice("Google Light", "Utility")
//

    var smartDeviceTV = SmartTvDevice("tele", "diversion")
    var smartDeviceLight = SmartLightDevice("foco ", "bien")
    var devices = SmartHome(smartDeviceTV,smartDeviceLight)
    // llamando a los nuevos metodos que creasmos en SmartHome


    // para la TV
    println("------------------------------------------")
    devices.turnOnTv()
    devices.increaseTvVolume()
    devices.decreaseTvVolume()
    devices.changeTvChannelToPrevious()
    devices.printSmartTvInfo()


    // para 2la luz
    println("-----------------------------------------------")
    devices.turnOnLight()
    devices.increaseLightBrightness()
    devices.decreaseLightBrightness()
    devices.printSmartLightInfo()

    println("-----------------------------------------------")
    // apagando todos los dispositivos
    devices.turnOffAllDevices()



}