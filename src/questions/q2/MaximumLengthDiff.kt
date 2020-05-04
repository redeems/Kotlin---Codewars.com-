package questions.q2

import kotlin.math.abs

fun main() {
    val a = arrayOf("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz") //3 min
    val b = arrayOf("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww") //16 max
    println("maxDiff = " + maxLenDiff(a,b)) //16 - 3 = 13

//    maxDiff = 13
//
//    Process finished with exit code 0
}


//refactor param names to a and b, for better clarity.
fun maxLenDiff(a: Array<String>, b: Array<String>): Int =
     //Find max(abs(length(x) − length(y)))
    //If a and/or b are empty return -1
    if (a.isEmpty() || b.isEmpty()) -1
    else {

        //get the maxed char size in a
        //always default to 0, however, we should never actually result in 0. as we assured a & b are not empty.
        val maxA = a.map { it.length }.max() ?: 0
        //get the min char size in a
        val minA = a.map { it.length }.min() ?: 0
        //get the maxed char size in b
        val maxB = b.map { it.length }.max() ?: 0
        //get the min char size in b
        val minB = b.map { it.length }.min() ?: 0

        //check dif from a to b looking for max diff
        val diffA = (maxA - minB).abs()
        //vise versa check the other direction
        val diffB = (minA - maxB).abs()

        //get the highest valued difference and return it
        if (diffA > diffB) diffA else diffB
    }

//(a < 0) ? -a : a; <--abs
private fun Int.abs() : Int {return if(this < 0) -this else this}
