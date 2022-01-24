package uz.shoxsoft.fastfooddemo.Domain

import java.io.Serializable

class FoodDomain(
    var title: String, var pic: String, var description: String, var fee: Double
) : Serializable {
    private var numberInCard: Int = 0

    constructor(
        title: String,
        pic: String,
        description: String,
        fee: Double,
        numberInCard: Int
    ) : this(title, pic, description, fee) {
        this.numberInCard = numberInCard
    }
}