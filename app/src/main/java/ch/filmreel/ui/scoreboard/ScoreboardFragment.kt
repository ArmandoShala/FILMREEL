package ch.filmreel.ui.scoreboard
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ch.filmreel.R
import ch.filmreel.databinding.FragmentScoreboardBinding
import ch.filmreel.model.Quiz
import com.squareup.picasso.Picasso


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
        val quiz: Quiz = arguments?.get("QUIZ") as Quiz
        // TODO: What if there were multiple questions?
        binding.textQuestionTitle.text = quiz.movie.questions[0].question
        binding.textScorePlayer1.text = quiz.player1.points.toString()
        binding.textScorePlayer2.text = quiz.player2.points.toString()
        // TODO: what when multiple answers are correct?
        binding.textQuestionAnswer.text = quiz.movie.questions[0].answers.filter { it.isTrueAnswer }[0].answer
        Picasso.get().load(quiz.movie.image).into(binding.imageView)
        binding.buttonBackToQuizz.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_score_to_navigation_quiz)
        }

        binding.floatingButtonShowMoreInfoToMovie.setOnClickListener {
           // TODO: Show more info to movie with ExpandableListView
        }


        binding.buttonEndGame.setOnClickListener {
           findNavController().navigate(R.id.action_navigation_score_to_navigation_leaderboard)
        }


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}