package ch.filmreel.placeholder

import ch.filmreel.model.Answer
import ch.filmreel.model.Movie
import ch.filmreel.model.Question
import java.util.ArrayList

/**
 * Helper class for providing sample content for user interfaces created by Android template wizards.
 */
object MoviePlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    var ITEMS: MutableList<Movie> = ArrayList()

    init {
        ITEMS = createPlaceholderItem()
    }

    fun createPlaceholderItem(): MutableList<Movie> {
        // Add some sample items.
        val theGodfather = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Godfather",
            1972,
            "Crime",
            "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            175,
            5.0,
            mutableListOf(Question("Who is the director of this movie?", mutableListOf(Answer("Francis Ford Coppola", true), Answer("Martin Scorsese", false), Answer("Steven Spielberg", false), Answer("Quentin Tarantino", false)))),
            "https://img.nzz.ch/2022/02/19/6be9e4c5-efda-40c6-8f94-816bdd332c2a.jpeg?width=960&height=539&fit=bounds&quality=75&auto=webp&crop=4096,2302,x0,y436",
            true
        )
        val theGoddather2 = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Godfather: Part II",
            1974,
            "Crime",
            "The early life and career of Vito Corleone in 1920s New York is portrayed while his son, Michael, expands and tightens his grip on the family crime syndicate.",
            202,
            5.0,
            mutableListOf(Question("Who is the director of this movie?", mutableListOf(Answer("Francis Ford Coppola", true), Answer("Martin Scorsese", false), Answer("Steven Spielberg", false), Answer("Quentin Tarantino", false)))),
            "https://www.filmlinc.org/wp-content/uploads/2011/08/NYFF57_Retrospective_TheGodfatherPartII_02-1.jpg",
            true
        )
        val theDarkKnight = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Dark Knight",
            2008,
            "Action",
            "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice.",
            152,
            5.0,
            mutableListOf(Question("Who is the director of this movie?", mutableListOf(Answer("Francis Ford Coppola", true), Answer("Martin Scorsese", false), Answer("Steven Spielberg", false), Answer("Quentin Tarantino", false)))),
            "https://static.kino.de/wp-content/uploads/2015/08/the-dark-knight-2008-filmplakat-rcm1920x1080u.jpg",
            false
        )
        val theShawshankRedemption = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Shawshank Redemption",
            1994,
            "Crime",
            "Two imprisoned men bond over a number of years, finding solace and eventual redemption through ",
            142,
            5.0,
            mutableListOf(Question("Who is the director of this movie?", mutableListOf(Answer("Francis Ford Coppola", true), Answer("Martin Scorsese", false), Answer("Steven Spielberg", false), Answer("Quentin Tarantino", false)))),
            "https://m.media-amazon.com/images/M/MV5BNjQ2NDA3MDcxMF5BMl5BanBnXkFtZTgwMjE5NTU0NzE@._V1_QL75_UX500_CR0,47,500,281_.jpg",
            false
        )
        return mutableListOf(theGodfather, theGoddather2, theDarkKnight, theShawshankRedemption)
    }

    /**
     * A placeholder item representing a piece of content.
     */
    data class PlaceholderItem(val movie: Movie) {
        override fun toString(): String = movie.title
    }
}