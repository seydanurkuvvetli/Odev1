import kotlin.random.Random
fun main() {
    val number = Random.nextInt(102)
    var guessCount = 3
    while (guessCount > 0) {
        print("Tahmininizi yapın: ")
        val guess = readlnOrNull()?.toIntOrNull()
        if (guess == null) {
            println("geçerli sayı gir")
        } else if (guess > number) {
            println("daha küçük sayı deneyin")
        } else if (guess < number) {
            println("daha büyük sayı deneyin")
        } else  {
            println("tebrikler")
            break
        }
        guessCount--
        println("kalan hak $guessCount")
    }
    print("hakkınız bitti")
}
