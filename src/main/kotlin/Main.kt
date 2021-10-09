import kotlin.math.hypot

fun main() {
    println("Hello, World!")
    println(5+7)
    println(9-3)
    println(5*5)
    println(9/2)
    val z = 15.0
    print(z/2)
    println("  <----")

    val n = readInt()
    val m = readInt()
    println("n = $n")
    println("m = $m")
    val t = n+m
    println("m + n = $t")

    val (x,y) = readDoubles()

    val r = hypot(x,y)
    println("R = $r")
}

fun readInt() = readLine()!!.toInt()

fun readDouble() = readLine()!!.toDouble()

fun readDoubles() = readLine()!!.split(" ").map { it.toDouble() }