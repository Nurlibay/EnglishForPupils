package uz.nurlibaydev.englishforpupils.data

object DataList {
    fun getAllUnits(): List<String> {
        val units = mutableListOf<String>()
        repeat(30) {
            units.add("Unit ${it + 1}")
        }
        return units
    }
}