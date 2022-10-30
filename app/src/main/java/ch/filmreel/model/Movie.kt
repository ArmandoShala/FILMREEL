package ch.filmreel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Movie constructor(var id: UUID,
                             var title : String,
                             var year : Int,
                             var genre : String,
                             var description : String,
                             var duration : Double,
                             var rating : Int,
                             var questions : MutableList<Question>,
) : Parcelable {

    fun rate(rating : Int) {
        this.rating = rating
    }


}