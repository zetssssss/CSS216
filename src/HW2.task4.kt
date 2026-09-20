class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    val song = Song(
        "Sweater Weather",
        "The Neighbourhood",
        2013,
        676767
    )

    println("Popular: ${song.isPopular}")
    song.printDescription()
}