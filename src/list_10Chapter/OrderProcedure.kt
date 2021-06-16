package list_10Chapter

//2021/6/16;
fun main(){
    OrderProcedure.main()
}
object OrderProcedure {
    const val TAVERN_NAME="Taernyl's Folly"
    fun main(){
        val patronList : List<String> = listOf("Eli","Mor doc","Sophie")
        patronList.forEachIndexed { index,patron->
            println("Good evening, $patron - you're #${index+1} in line.")
            placeOrder(patron,"shandy,Dragon's Breath,5.91")
        }
    }
    private fun placeOrder(patronName: String, menuData: String) {
        val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
        val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
        println("$patronName speaks with $tavernMaster about their order.")
        val (type, name, price) =menuData.split(',')
        val message = "$patronName buys a $name($type) for $price"
        println(message)
        val phrase = if(name == "Dragon's Breath"){
            "$patronName exclaims: ${toDragonSpeak("Ah ,delicious $name!")}"
        }else{
            "$patronName says: Thanks for $name."
        }
        println(phrase)
    }
    private fun toDragonSpeak(phrase: String)=
        phrase.replace(Regex("[aeiou]")){
            when(it.value){
                "a"->"4"
                "e"->"3"
                "i"->"1"
                "o"->"0"
                "u"->"|_|"
                else->it.value
            }
        }
}