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
    val or01 = false || false
    val or02 = true || true
    val or03 = false || true
    val or04 = true || false

    val andOr = (1 < 2 && 3 > 4) || 1 < 4

    print(andOr)
}