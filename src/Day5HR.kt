import java.util.*

object Day5HackerRank {
    private val scanner: Scanner = Scanner(System.`in`) //Desde aqui
    @JvmStatic
    fun main(args: Array<String>) {
        val n: Int = scanner.nextInt()
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?") // hasta aqui ya estaba en el ejercicio.

        for (i in 1..10) {
            println(n.toString() + " x " + i + " = " + n * i) // solo agregué el ciclo for
        }
    }
} //fin