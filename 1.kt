import java.util.Scanner
import kotlin.math.*
val scanner = Scanner(System.`in`)
fun main() {
    println("Hello! My name is FirstBot\nI was created in 27.12.2021.")
    println("Please, remind me your name.")
    val name = scanner.nextLine()
    println("What a great name you have, $name!")

    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val r3 = readLine()!!.toInt()
    val r5 = readLine()!!.toInt()
    val r7 = readLine()!!.toInt()
    val age = (r3 * 70 + r5 * 21 + r7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")

    println("Now I will prove to you that I can count to any number you want.")
    val count = readLine()!!.toInt()
    for (i in 0..count) {
        println("$i!")
    }

    val option1 = "1. To repeat a statement multiple times."
    val option2 = "2. To decompose a program into several small subroutines."
    val option3 = "3. To determine the execution time of a program."
    val option4 = "4. To interrupt the execution of a program.\")"
    println("Let's test your programming knowledge.\nWhy do we use methods?\n$option1\n$option2\n$option3\n$option4")
    var x = readLine()!!.toInt()
    while(x != 2) {
        println("Please, try again.")
        x = readLine()!!.toInt()
    }
    println("Congratulations, have a nice day!")
}
/*val firstAnswer = readLine().toBoolean() // read other values in the same way
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()
    if (confession or (firstAnswer xor secondAnswer))
        println("false")

    else
        println("true")*/
    /*val a = 2
    var b = 3
    val c = a + 4 * b--
    val y = a+ 4 * b
    println("$c\n$y")   // this is 10*/

/*println(Int.SIZE_BITS)
    println(Byte.MIN_VALUE)
    println(Byte.MAX_VALUE)
    println(Long.MIN_VALUE)
    println(Long.MAX_VALUE)
    println(Double.MIN_VALUE)
    println(Double.MAX_VALUE)
    val num32 = 32*/


/*fun shippingCost (amount: Double, international: Boolean): Double {
    return if (!international && amount >= 75.0) {0.0}
    else if (!international && amount < 75.0) {amount*0.10}
    else if (international && amount*0.15 >= 50.0) {50.0}
    else {amount*0.15}
    }
fun main() {
    val amount = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()
    println(shippingCost(amount, international))
}

 */
/* заказы в США свыше 75 долларов - бесплатно
заказы в США до 75 долларов - 10 процентов стоимости
заказы зырубеж только до 50 долларов, стоимсоть доставки 15%
 */


/*println ("""    {""")
println ("""    "firstName": "John",""")
println ("""    "lastName": "Smith",""")
println ("""    "age": 35,""")
println ("""    "phoneNumbers": [""")
println ("""        {""")
println ("""            "type": "mobile",""")
println ("""            "number": "123 567-7890"""")
println ("""        }""")
println ("""    ]""")
println ("""}""")
//put your code here*/

