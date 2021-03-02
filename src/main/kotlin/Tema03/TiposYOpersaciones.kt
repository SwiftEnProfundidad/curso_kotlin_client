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
    //print(totalCost02)

    val stringDog = "Dog"

    var message = "Hello" + " my name is "
    val name = "Joe"
    message += name // "Hello my name is Joe"
    //print(message)

    val exclamationMark: Char = '!'
    message += exclamationMark // "Hello my name is Joe!"

    // String Templates

    message = "Hello my name is $name!" // "Hello my name is Joe!"

    val oneThird = 1.0 / 3.0
    val oneThirdLongString = "One third is $oneThird as a decimal."

    //print(oneThirdLongString)

    val oneThirdLongString02 = "One third is ${1.0 / 3.0} as a decimal."
    //print(oneThirdLongString02)

    // Strings Multilinea

    val bigString = """
  |You can have a string that contains multiple
  |lines
  |by
  |doing this.
  """.trimMargin()
    println(bigString)





































}