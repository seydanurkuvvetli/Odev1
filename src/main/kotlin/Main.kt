import kotlin.random.Random
fun main() {
    val tutulanSayi = Random.nextInt(102)
    var tahminSayisi = 3
    while (tahminSayisi > 0) {
        print("Tahmininizi yapın: ")
        val tahmin = readlnOrNull()?.toIntOrNull()
        if (tahmin == null) {
            println("geçerli sayı gir")
        } else if (tahmin > tutulanSayi) {
            println("daha küçük sayı deneyin")
        } else if (tahmin < tutulanSayi) {
            println("daha büyük sayı deneyin")
        } else  {
            println("tebrikler")
            break
        }
        tahminSayisi--
        println("kalan hak $tahminSayisi")
    }
    print("hakkınız bitti")
}
