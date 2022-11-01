package ch.filmreel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Question constructor(var question : String, var answers : MutableList<Answer>) : Parcelable {

    fun checkAnswer(isTrueAnswer: Boolean) : Boolean {
        return answers.any { it.checkAnswer(isTrueAnswer) }
    }


}