package Tema04

fun main() {

    // Operadores booleanos
    val yes: Boolean = true
    val no = false

    val doesOneEqualTWo = (1 == 2)

    val doesOneNotEqualTwo = (1 != 2)
    val finalValue = doesOneNotEqualTwo

    val alsoTrue = !(1 == 2)

   // print(alsoTrue)

    val isOneGreaterThanTwo = (1 >= 2)
    val isOneLessThanTwo = (1 <= 2)

    /*  Resumiendo
    < Menor
    > Mayora
    == Comparación si dos tipos son iguales
    <= Menor o igual
    >= Mayor o igual
    != Si es distinto de
    */

   // Operador Booleano AND
    val and1 = false && false
    val and2 = true && true
    val and3 = false && true
    val and4 = true && false

    // Operador Booleano OR
    val or01 = false || false // false
    val or02 = true || true // true
    val or03 = false || true // true
    val or04 = true || false // true

    val andOr = (1 < 2 && 3 > 4) || 1 < 4

    // Igualdad de cadenas
    val guess = "dog"
    val dogEqualsCat = guess == "cat"

    val order = "cat" < "dog"

    // La expresión if
    if (2 > 1) {
       // println("Yes, 2 is greater than 1.")
    }

    // La expresión if/else
    val animal = "Fox"

    if (animal == "Cat" || animal == "Dog") {
        println("Animal is a house pet.")
    } else {
        println("Animal is not a house pet.")
    }

    // La expresión if-else
   /*
    val a = 5
    val b = 10

    val min: Int
    if (a < b) {
        min = a
    } else {
        min = b
    }

    val max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    */

    // La expresión if-else en una línea
    val a = 5
    val b = 10

    val min = if (a < b) a else b
    val max = if (a > b) a else b

    // La expresión else-if
    var hourOfDay = 12

    val timeOfDay = if (hourOfDay < 6) {
        "Early morning"
    } else if (hourOfDay < 12) {
        "Morning"
    } else if (hourOfDay < 17) {
        "Afternoon"
    } else if (hourOfDay < 20) {
        "Evening"
    } else if (hourOfDay < 24) {
        "Late evening"
    } else {
        "INVALID HOUR!"
    }
    println(timeOfDay)


}