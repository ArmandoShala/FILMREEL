package ch.filmreel.model


class Quiz constructor(var player : Player, var movie : Movie) {

    fun rateMovie(rating : Int) {
        movie.rate(rating)
    }

    fun addToWatchList() {
        player.addToWatchList(movie)
    }

    fun addPoints(points : Double) {
        player.addPoints(points)
    }

}