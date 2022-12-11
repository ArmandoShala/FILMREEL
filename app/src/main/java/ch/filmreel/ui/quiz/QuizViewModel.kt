package ch.filmreel.ui.quiz

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import ch.filmreel.db.AppDatabase
import ch.filmreel.db.entity.Movie
import ch.filmreel.db.repository.QuizRepository
import ch.filmreel.model.QuizAndPlayerAndMovie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuizViewModel(application: Application) : AndroidViewModel(application) {
    val getQuiz: LiveData<List<QuizAndPlayerAndMovie>>
    private val quizRepository: QuizRepository


    init {
        val quizWithPlayersAndMovieDAO = AppDatabase.getDatabase(application).quizWithPlayersAndMovieDAO()
        quizRepository = QuizRepository(quizWithPlayersAndMovieDAO)
        getQuiz = quizRepository.quizWithMoviesAndPlayer
    }
}