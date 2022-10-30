package ch.filmreel.ui.watchlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ch.filmreel.databinding.FragmentWatchlistBinding
import ch.filmreel.model.Movie
import ch.filmreel.model.MovieAdapter

class WatchlistFragment() : Fragment() {
    private lateinit var watchlistViewModel: WatchlistViewModel
    private lateinit var watchlistItems: MutableList<Movie>;

    private var _binding: FragmentWatchlistBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val watchlistViewModel = ViewModelProvider(this)[WatchlistViewModel::class.java]
        initMockData();
        _binding = FragmentWatchlistBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val adapter: MovieAdapter = MovieAdapter(watchlistItems, requireContext())
        binding.watchlist.adapter = adapter
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initMockData() {
        // initialize watchlistItems
        val theGodfather = Movie(
            "MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM",
            "The Godfather",
            1972,
            "Crime",
            "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            175.0,
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
            202.0,
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
            152.0,
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
            142.0,
            5,
            mutableListOf(),
            false
        )
        watchlistItems =
            mutableListOf(theGodfather, theGoddather2, theDarkKnight, theShawshankRedemption)
    }
}
