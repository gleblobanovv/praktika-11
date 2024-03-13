enum class Color( var number:Int,var rgb:Int) {
    RED(1,0xFF0000),
    GREEN(2,0x00FF00),
    BLUE(3,0x0000FF),
    YELLOW(4,0xFFFF00),
    PURPLE(5,0x800080),
    PINK(6,0xFFC0CB),
    WHITE(7,0xFFFFFF);

    fun TextColor(){
        var color=when(this)
        {
            RED->"\u001B[31m"
            GREEN->"\u001B[32m"
            BLUE->"\u001B[34m"
            YELLOW->"\u001B[33m"
            PURPLE->"\u001B[35m"
            PINK->"\u001B[199m"
            WHITE->"\u001B[37m"
        }
        println("$color${this.rgb}\u001B[0m")
    }

    fun Tepliy(){
        println("Введите цвет")
        var color= readLine()!!.toString()
        if (color=="Red"||color=="Yellow"){
            println("Цвет ${color}-теплый")
        }
        else{
            println("Цвет ${color}-холодный")
        }
    }

}