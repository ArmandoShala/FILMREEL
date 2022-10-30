package ch.filmreel.model

class Question constructor(var question : String, var answers : MutableList<Answer>) {

    fun checkAnswer(answer : String) : Boolean {
        return answers.any { it.checkAnswer(answer) }
    }


}