package ch.filmreel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Movie constructor(var id: String,
                             var title : String,
                             var year : Int,
                             var genre : String,
                             var description : String,
                             var duration : Double,
                             var rating : Double,
                             var questions : MutableList<Question>,
                             var image: String,
                             var seen: Boolean = false,
) : Parcelable {

    fun rate(rating : Double) {
        this.rating = rating
    }


}