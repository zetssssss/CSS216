fun main() {
    println(lessTimeSpentToday(300, 250))
    println(lessTimeSpentToday(300, 300))
    println(lessTimeSpentToday(200, 220))
}

fun lessTimeSpentToday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}