package ch.filmreel.placeholder

import ch.filmreel.model.Movie
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

    private fun createPlaceholderItem(): MutableList<Movie> {
        // Add some sample items.
        val theGodfather = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Godfather",
            1972,
            "Crime",
            "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            175,
            5,
            mutableListOf(),
            true
        )
        val theGoddather2 = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Godfather: Part II",
            1974,
            "Crime",
            "The early life and career of Vito Corleone in 1920s New York is portrayed while his son, Michael, expands and tightens his grip on the family crime syndicate.",
            202,
            5,
            mutableListOf(),
            true
        )
        val theDarkKnight = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Dark Knight",
            2008,
            "Action",
            "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice.",
            152,
            5,
            mutableListOf(),
            false
        )
        val theShawshankRedemption = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Shawshank Redemption",
            1994,
            "Crime",
            "Two imprisoned men bond over a number of years, finding solace and eventual redemption through ",
            142,
            5,
            mutableListOf(),
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