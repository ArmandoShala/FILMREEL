package ch.filmreel.ui.scoreboard
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ch.filmreel.databinding.FragmentScoreboardBinding
import ch.filmreel.model.Movie
import ch.filmreel.model.Player


class ScoreboardFragment : Fragment() {

    private var _binding: FragmentScoreboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentScoreboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val player1: Player = arguments?.get("PLAYER1") as Player
        val player2: Player = arguments?.get("PLAYER2") as Player
        val movie: Movie = arguments?.get("MOVIE") as Movie
        println(player1.name)
        println(player2.name)
        println(movie.genre)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}