package creational.builder

import java.lang.StringBuilder

class Home private constructor() {

    companion object {

        fun builder(homeName: String): HomeBuilder {
            return Home().HomeBuilder(homeName)
        }

    }

    private var homeName: String = ""
    private var floorsNumber: Int = 1
    private var hasGarage = false
    private var hasGarden = false

    override fun toString(): String {
        val homeInfo = StringBuilder()
        homeInfo.append("$homeName ")
        homeInfo.append(if (floorsNumber == 1) "with single floor " else "with $floorsNumber ")
        homeInfo.append("& ")
        homeInfo.append( if (hasGarage) "has " else "without ")
        homeInfo.append("garage ")
        homeInfo.append("& ")
        homeInfo.append(if (hasGarden) "has " else "without ")
        homeInfo.append("garden ")
        return homeInfo.toString()
    }

    inner class HomeBuilder(homeName: String) {

        init {
            if (homeName.isBlank()) throw IllegalArgumentException("Name required")

            this@Home.homeName = homeName
        }

        fun hasGarden(garden: Boolean): HomeBuilder {
            hasGarden = garden
            return this
        }

        fun hasGarage(garage: Boolean): HomeBuilder{
            hasGarage = garage
            return this
        }

        fun setFloorsNumber(count: Int): HomeBuilder{
            if (count !in 1..5) throw IllegalArgumentException("You can not build smaller 1 or bigger 5 floors")

            floorsNumber = count
            return this
        }


        fun build(): Home {
            return this@Home
        }

    }

}