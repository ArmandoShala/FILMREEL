package ch.filmreel.model


class Quiz(var player1: Player, var player2: Player, var movie: Movie) {

    init {
        player1.addPoints(0.0)
        player2.addPoints(0.0)
        val startTime = System.currentTimeMillis()
    }

    fun rateMovie(rating : Int) {
        movie.rate(rating)
    }

    fun addToWatchList(player: Player, movie: Movie) {
        player.addToWatchList(movie)
    }

    fun addPoints(points : Double) {
        player1.addPoints(points)
    }

    fun answerQuestion(question : Question, answer : String) : Boolean {
        if (question.checkAnswer(answer)) {
            addPoints(10.0)
            return true
        }
        return false
    }

}