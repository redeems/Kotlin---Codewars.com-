package questions.q5

fun main() {
    println(reverseLetter("ewfjiowej459difj23"))
}
//take a String, reverse and extract it's chars into an array. next filter out only letters, and join the array to string with no separator.
fun reverseLetter(str: String): String = str.reversed().toCharArray().filter { it.isLetter() }.joinToString("")
