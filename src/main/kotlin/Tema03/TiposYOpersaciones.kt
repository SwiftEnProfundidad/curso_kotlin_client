package Tema03


fun main() {

    // Inferencia de tipos

    val number: Int = 10
    val pi: String = "dfasdf"
    val primo2 = 23
    //print(number)

    // Conversion de tipos

    var integer = 100
    var integer02: Int = 200
    var decimal = 12.5

    integer = decimal.toInt()

    var monstruosPantalla01: Int = 10
    var moscasVoladoraTriple: Double = 30.55

    monstruosPantalla01 = moscasVoladoraTriple.toInt()
    // print()

    // Operadores con tipos mixtos

    val hourlyRate = 19.5
    val hoursWorked = 10

    val TranformhoursWorked = 10.toDouble()
    val totalCost = hourlyRate * hoursWorked.toDouble()
    val typeInferredDouble = 3.14159

    val totalCost02 = hourlyRate * hoursWorked
    print(totalCost02)

    val stringDog = "Dog"

    var message = "Hello" + " my name is "
    val name = "Joe"
    message += name // "Hello my name is Joe"
    print(message)

    val exclamationMark: Char = '!'
    message += exclamationMark // "Hello my name is Joe!"

    // String Templates
}