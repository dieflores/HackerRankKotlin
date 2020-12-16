import java.util.*

fun main() {

    var n: Int
    val sc = Scanner(System.`in`)
    do { n = sc.nextInt()}
    while (n < 1 || n > 100)
    if (n % 2 == 0) {
        if (n >= 2 && n <= 5)
            println("Not Weird")
        else if (n >= 6 && n <= 20)
            println("Weird")
        else if (n > 20)
            println("Not Weird")
    }
    else {
        println("Weird")
    }
}
