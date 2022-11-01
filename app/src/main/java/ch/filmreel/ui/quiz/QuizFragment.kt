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
import ch.filmreel.model.*
import ch.filmreel.ui.scoreboard.ScoreboardFragment
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
                "Jeffry Dahmer", 2022, "Horror",
                "Im Verlauf von über einem Jahrzehnt wurden 17 junge Männer von dem verurteilten Mörder Jeffrey Dahmer ermordet. Wie konnte er der Verhaftung so lange entgehen?", 530.0, 4.8,
                mutableListOf(Question("Was ist das Hauptgenre des Films?",
                    mutableListOf(
                    Answer("Horror", true),
                    Answer("Drama", false),
                    Answer("Action", false),
                    Answer("Comedy", false)))),
                "https://www.lto.de/fileadmin/_processed_/e/d/csm_Bildschirmfoto_2022-10-21_um_1.27.21_PM_a53104d704.png"
            ))

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
        bundle.putParcelable("QUIZ", quiz)
        val scoreboardFragment = ScoreboardFragment()
        scoreboardFragment.arguments = bundle
        findNavController().navigate(R.id.action_navigation_quiz_to_navigation_score, bundle)
    }
}