fun <T : Comparable<T>> max0f(list: List<T>): T? {
    if (list.isEmpty()) {
        return null
    }
    var max = list[0]
    for (item in list) {
        if (item > max) {
            max = item
        }
    }
    return max
}

fun main() {
    println(max0f(listOf(3, 7, 2, 9))) // 9
    println(max0f(listOf(" apple ", " banana ", " kiwi "))) // " kiwi "
    println(max0f(emptyList<Int>())) // null
}
