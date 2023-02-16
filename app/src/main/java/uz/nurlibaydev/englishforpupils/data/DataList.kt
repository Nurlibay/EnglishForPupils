package uz.nurlibaydev.englishforpupils.data

import uz.nurlibaydev.englishforpupils.data.models.UnitData

object DataList {

    fun getAllUnits(): List<UnitData> {
        val units = mutableListOf<UnitData>()
        repeat(30) {
            units.add(UnitData("Unit ${it + 1}"))
        }
        return units
    }
}