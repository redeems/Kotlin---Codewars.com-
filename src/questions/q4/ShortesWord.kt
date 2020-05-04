package questions.q4

fun main() {
    println(findShort("turns out random test cases are easier than writing out a basic one")) //expected 1
}
//split the words into a String[] by " " then get the minimum iterations length, and take that iteration.
//finally, get the length of that string and return it.
fun findShort(s: String): Int? = s.split(" ").minBy { it.length }?.length