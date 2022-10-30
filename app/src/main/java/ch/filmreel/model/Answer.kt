package ch.filmreel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Answer constructor(var answer : String) : Parcelable {

    fun checkAnswer(answer : String) : Boolean {
        return this.answer == answer
    }

}