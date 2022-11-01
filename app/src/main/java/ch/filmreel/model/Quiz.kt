package ch.filmreel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Quiz(var player1: Player, var player2: Player, var movie: Movie) : Parcelable {

    init {
        player1.addPoints(0.0)
        player2.addPoints(0.0)
        val startTime = System.currentTimeMillis()
    }

    fun rateMovie(rating : Double) {
        movie.rate(rating)
    }

    fun addToWatchList(player: Player, movie: Movie) {
        player.addToWatchList(movie)
    }

    fun addPoints(points : Double, player: Player) {
        player.addPoints(points)
    }

    fun answerQuestion(question : Question, isTrueAnswer : Boolean, player: Player) : Boolean {
        if (question.checkAnswer(isTrueAnswer )) {
            addPoints(10.0, player)
            return true
        }
        return false
    }

}