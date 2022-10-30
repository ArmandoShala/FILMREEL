package ch.filmreel.ui.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ch.filmreel.R
import ch.filmreel.databinding.FragmentQuizBinding
import ch.filmreel.model.*
import ch.filmreel.ui.scoreboard.ScoreboardFragment
import ch.filmreel.ui.home.HomeFragment
import java.util.*


class QuizFragment : Fragment() {

    private var _binding: FragmentQuizBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var quiz: Quiz? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val quizViewModel =
            ViewModelProvider(this)[QuizViewModel::class.java]

        quiz = Quiz(Player(0.0, "Player 1", mutableListOf()),
            Player(0.0, "Player 2", mutableListOf()),
            Movie(UUID.randomUUID(),
                "Landrits lebe", 2022, "Horror",
                "Mis lebe isch en horror", 2000.0, 10,
                mutableListOf(Question("Was isch das für es lebe?",
                    mutableListOf(
                    Answer("Horror"))))))

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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun goToScoreBoard() {
        val bundle = Bundle()
        bundle.putParcelable("PLAYER1", quiz?.player1)
        bundle.putParcelable("PLAYER2", quiz?.player2)
        bundle.putParcelable("MOVIE", quiz?.movie)
        val scoreboardFragment = ScoreboardFragment()
        scoreboardFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(this.id, scoreboardFragment)
            .commit()
    }
}