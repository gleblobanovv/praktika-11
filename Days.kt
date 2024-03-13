enum class Days(var day:String,val num:Int) {
    Monday("Понедельник",1),
    Tuesday("Вторник",2),
    Wednesday("Среда",3),
    Thursday("Четверг",4),
    Friday("Пятница",5),
    Saturday("Суббота",6),
    Sunday("Воскресенье",7);

    fun TextColor(){
        var color=when(this)
        {
            Monday->"\u001B[31m"
            Tuesday->"\u001B[32m"
            Wednesday->"\u001B[34m"
            Thursday->"\u001B[33m"
            Friday->"\u001B[35m"
            Saturday->"\u001B[199m"
            Sunday->"\u001B[37m"
        }
        println("$color${this.day}\u001B[0m")
    }
    fun Next_Day(){
        println("Введите день недели")
        var day_now= readLine()!!.toString()
        when (this){
            Monday-> println("Завтра Tuesday")
            Tuesday-> println("Завтра Wednesday")
            Wednesday-> println("Завтра Thursday")
            Thursday-> println("Завтра Tuesday")
            Friday-> println("Завтра Friday")
            Saturday-> println("Завтра  Sunday")
            Sunday-> println("Завтра Monday")
        }

    }
    fun Day_wekend(day_now:String){
        if(day_now!="Saturday"||day_now!="Sunday"){
            println("${day_now}-выходной")
        }
        else{
            println("${day_now}-рабочий")
        }
    }


}