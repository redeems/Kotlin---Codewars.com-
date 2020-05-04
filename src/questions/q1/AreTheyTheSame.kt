package questions.q1

import java.util.*
import kotlin.math.sqrt

class AreTheyTheSame {
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {
            val a = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
            val b = intArrayOf(121, 14641, 20736, 361, 25921, 361, 20736, 361)
            comp(a,b)
        }

        fun comp(a: IntArray?, b: IntArray?): Boolean {
            //early return case
            if(a == null || b == null) return false

            //log origin a.
            println("a ->" + Arrays.toString(a))

            //now we can sort it
            a.sort()
            println("a sorted ->" + Arrays.toString(a))

            //now map it, with each iteration sq.
            val mappedA = a.map { it.sq() }
            println("a mapped -> $mappedA")

            //if the sq rt. of index 0 of array a == index 0 of array b return true
            return mappedA == b.sorted()
        }

        private fun Int.sq() : Int {return this * this}

    }
}
