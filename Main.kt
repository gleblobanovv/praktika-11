fun main(){
    for(day in Days.values()){
        println("${day.day}-${day.num}")
    }
    for(Colour in Color.values()){
        println("${Colour.rgb}-${Colour.number}")
    }
    println("-----------------")
    Color.RED.TextColor()
    Color.GREEN.TextColor()
    Color.BLUE.TextColor()
    Color.YELLOW.TextColor()
    Color.PURPLE.TextColor()
    Color.PINK.TextColor()
    Color.WHITE.TextColor()
    println("-----------------")
    Days.Monday.TextColor()
    Days.Tuesday.TextColor()
    Days.Wednesday.TextColor()
    Days.Thursday.TextColor()
    Days.Friday.TextColor()
    Days.Saturday.TextColor()
    Days.Sunday.TextColor()
    println("-----------------")
    var col=Color.RED.Tepliy()
    println("-----------------")
    var dayy=Days.Monday.Next_Day()
}