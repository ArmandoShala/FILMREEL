package ch.filmreel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Movie constructor(var id: UUID,
                             var title : String,
                             var year : Int,
                             var genre : String,
                             var description : String,
                             var duration : Double,
                             var rating : Double,
                             var questions : MutableList<Question>,
                             var image: String,
) : Parcelable {

    fun rate(rating : Double) {
        this.rating = rating
    }


}