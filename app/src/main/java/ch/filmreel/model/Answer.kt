package ch.filmreel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Answer constructor(var answer : String, var isTrueAnswer: Boolean) : Parcelable {

    fun checkAnswer(isTrueAnswer: Boolean) : Boolean {
        return this.isTrueAnswer == isTrueAnswer
    }

}