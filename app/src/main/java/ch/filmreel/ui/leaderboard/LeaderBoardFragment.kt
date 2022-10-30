package ch.filmreel.ui.leaderboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ch.filmreel.databinding.FragmentLeaderboardBinding

class LeaderBoardFragment : Fragment() {
    private var _binding: FragmentLeaderboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentLeaderboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.textView.text = "Leaderboard"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}