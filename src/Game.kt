fun main(){
    var healthPoints : Int = 89
    val playerName = "Madrigal"
    val isBlessed = true
     if(healthPoints == 100) println(playerName +" is an Excellent Condition !" + "  " + healthPoints)
    else if (healthPoints in 90 .. 99) println(playerName +" has afew Scratches " + "   " +healthPoints)
    else if (healthPoints in 75 .. 89) {
         if (isBlessed == true) println(playerName + "has some miner wounds but is healing quite qickly" + "  " +healthPoints)
         else println("has some minor wounds")
     }
    else if (healthPoints in 15 ..74) println(playerName +" looks pretty hurt" + "   " + healthPoints)
    else println(playerName+ " is in awful condition" +"   " + healthPoints)

}