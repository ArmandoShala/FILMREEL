package ch.filmreel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Player(var points: Double, var name: String, var watchList: MutableList<Movie>) : Parcelable {

    fun addPoints(points : Double) {
        this.points += points
    }

    fun addToWatchList(movie : Movie) {
        watchList.add(movie)
    }

}