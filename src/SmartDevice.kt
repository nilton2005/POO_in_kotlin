
open class SmartDevice (val name: String, val category: String){
    var deviceStatus = "online"
    open val deviceType = "unknown"

    open fun turnOn() {
        println("Smart device is turned on.")
    }

    open fun turnOff() {
        println("Smart device is turned off.")
    }
    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }

        constructor(name: String, category: String, statusCode: Int) : this(name , category){
        deviceStatus = when(statusCode){
            0 -> "ofline"
            1 -> "online"
            else -> "uknow"
        }
    }



}