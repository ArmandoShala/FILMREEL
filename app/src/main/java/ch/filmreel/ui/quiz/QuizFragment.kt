package ch.filmreel.ui.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import ch.filmreel.R
import ch.filmreel.databinding.FragmentQuizBinding
import ch.filmreel.model.Movie
import ch.filmreel.model.Player
import ch.filmreel.model.Quiz
import ch.filmreel.placeholder.MoviePlaceholderContent
import ch.filmreel.ui.scoreboard.ScoreboardFragment
import java.util.*


class QuizFragment : Fragment() {

    private var _binding: FragmentQuizBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var quiz: Quiz? = null
    private var movies: MutableList<Movie>? = null
    private val mockDate = MoviePlaceholderContent

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        this.movies = mockDate.createPlaceholderItem()

        val quizViewModel =
            ViewModelProvider(this)[QuizViewModel::class.java]

        quiz = Quiz(Player(0.0, "Player 1", mutableListOf()),
            Player(0.0, "Player 2", mutableListOf()),
           getRandomMovie())

        _binding = FragmentQuizBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        quizViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        binding.goToScoreButton.setOnClickListener {
           goToScoreBoard()
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        quiz?.movie ?: getRandomMovie()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getRandomMovie(): Movie {
        return movies!![Random().nextInt(movies!!.size)]
    }

    private fun goToScoreBoard() {
        val bundle = Bundle()
        bundle.putParcelable("QUIZ", quiz)
        val scoreboardFragment = ScoreboardFragment()
        scoreboardFragment.arguments = bundle
        findNavController().navigate(R.id.action_navigation_quiz_to_navigation_score, bundle)
    }
}