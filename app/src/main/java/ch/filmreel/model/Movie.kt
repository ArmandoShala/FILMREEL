package ch.filmreel.model

import java.util.UUID

data class Movie constructor(var id: UUID,
                             var title : String,
                             var year : Int,
                             var genre : String,
                             var description : String,
                             var duration : Double,
                             var rating : Int,
                             var questions : MutableList<Question>,
) {

    fun rate(rating : Int) {
        this.rating = rating
    }


}