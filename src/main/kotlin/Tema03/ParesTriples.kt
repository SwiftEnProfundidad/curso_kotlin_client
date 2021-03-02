package Tema03

import java.util.function.DoubleBinaryOperator

fun main() {

    // Pair o pares
    val coordinates: Triple<Int, Int, Double> = Triple(234, 3, 7.44)

    var coordinates02 = Triple(12,67,89)

    val coordinatesWhitTo = 2 to 3

    val coorinatesDoublen = Pair(2.2, 3.4)

    val monstruo01 = coordinates
    var monstruo02 = coordinates02

    // Acceso a los datos de un pair
    var monstruo01_x1 = coordinates02.first
    val monstruo01_y1 = coordinates02.second
    val monstruo01_z1 = coordinates02.third

   // print(monstruo01_x1)
   // print(monstruo01_y1)

    var posicionMonstruo01 = Pair("x = $monstruo01_x1" , "y = $monstruo01_y1")
    print(posicionMonstruo01)

    val (x, _, z) = coordinates02
    // x and y , z ,both inferred to be of type Int & Double

    val pos: Double = 20.1234567891234566666666663563463456345

    val a: Short = 12
    val b: Byte = 120
    val c: Int = -100000

    val answer = a + b + c // Answer will be an Int

    //print(answer)

    /*Types Any, Unit & nothing
    *
    * si queremos añadir más comentario*/

    val anyNumber: Any = 42
    val anyString: Any = "42" + "333"
"""
    ASFDASDF
""".trimIndent()

    fun add() {
        val result = 2 + 2
        println(result)
    }

    fun add2(): Unit {
        val result = 2 + 2
        println(result)
    }

    print(add2())

    fun doNothingForever(): Nothing {
        while(true) {

     // lo que va aquí dentro va a ser llamado infinitas veces
        }
    }

    var name = "Joe"
    name += " Howard"

}



