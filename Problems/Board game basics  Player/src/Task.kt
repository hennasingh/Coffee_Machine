import java.util.*

class Player(val id: Int, val name: String, val hp: Int = 100) {
    companion object {
        var id = 0
        fun create(name: String) = Player(id++, name)
    }
}