package ch.filmreel.model

import java.util.UUID

data class Movie constructor(var id: String,
                             var title : String,
                             var year : Int,
                             var genre : String,
                             var description : String,
                             var duration : Int,
                             var rating : Int,
                             var questions : MutableList<Question>,
                             var seen: Boolean = false,
) {

    fun rate(rating : Int) {
        this.rating = rating
    }


}