enum class DangerLevel(val type: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel() = type
}