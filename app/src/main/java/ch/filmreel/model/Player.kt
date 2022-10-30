package ch.filmreel.model

class Player constructor(var points : Double, var name : String, var watchList: MutableList<Movie>) {

    fun addPoints(points : Double) {
        this.points += points
    }

    fun addToWatchList(movie : Movie) {
        watchList.add(movie)
    }

}