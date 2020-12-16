import java.util.*

class Day4HR(initialAge: Int) {
    private var age = 0
    fun amIOld() {
        var amIOld = ""
        amIOld = if (age < 13) {
            "You are young."
        } else if (age >= 13 && age < 18) {
            "You are a teenager."
        } else {
            "You are old."
        }
        // Write code determining if this person's age is old and print the correct statement:
        println(amIOld)
    }

    fun yearPasses() {
        age++ // aqui estuve un buen rato tratando de resolver
        // Increment this person's age.
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sc = Scanner(System.`in`)
            val T = sc.nextInt()
            for (i in 0 until T) {
                val age = sc.nextInt()
                val p = Day4HR(age)
                p.amIOld()
                for (j in 0..2) {
                    p.yearPasses()
                }
                p.amIOld()
                println()
            }
            sc.close()
        }
    }

    init {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            println("Age is not valid, setting age to 0.")
        } else {
            age = initialAge
        }
    }
}