import java.util.*

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {

    val tip_value = meal_cost * tip_percent.toFloat()/100
    val tax_value = meal_cost * tax_percent.toFloat()/100
    val total_value = Math.round(meal_cost + tip_value + tax_value)

    print(total_value)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val meal_cost = scan.nextLine().trim().toDouble()

    val tip_percent = scan.nextLine().trim().toInt()

    val tax_percent = scan.nextLine().trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}

// SE AGREGA EL PRECIO DE LA COMIDA, LUEGO AGREGAMOS PORCENTAJE DE PROPINA, LUEGO IMPUESTOS.
// NOS REGRESA EL RESULTADO DE LA SUMA TOTAL DE LO INGERESADO.