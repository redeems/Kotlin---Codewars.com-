package questions.q3

fun main() {
    //test
    println(angle(3)) //180
    println(angle(4)) //360
    println(angle(5)) //540
}
//given examples
// assertEquals(180, angle(3))
// assertEquals(360, angle(4))

//Simply asked myself how to get those numbers given those inputs.
// n - 2 x 180 as a base angle works for these examples, and any example where n > 2
// n can never be less than 2 because the minimum sides a polygon has is 3. (triangle)

fun angle(n: Int): Int = 180 * (n - 2)
