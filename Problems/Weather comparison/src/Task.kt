class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = if (value < -92 || value > 57) {
                when (name) {
                    "Moscow" -> 5
                    "Hanoi" -> 20
                    else -> 30
                }
            } else {
                value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    val cities = listOf(secondCity, thirdCity)
    var (min, city) = Pair(firstCity.degrees, firstCity.name)

    for (i in cities) {
        if (i.degrees < min) {
            min = i.degrees
            city = i.name
        } else if (i.degrees == min) {
            city = "neither"
        }
    }
    print(city)
}