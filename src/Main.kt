import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

fun main(args: Array<String>) {
    println("hello test test1!")
    //val aDoc: URL = URL("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=MSFT&apikey=Z3P05Q707KN1YC91")
    val aDoc: URL = URL("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=FBGRX&interval=60min&apikey=Z3P05Q707KN1YC91")

    val info = aDoc.openStream().bufferedReader().use { reader -> println(reader.readText()) }
}