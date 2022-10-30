package ch.filmreel.model

class Answer constructor(var answer : String) {

    fun checkAnswer(answer : String) : Boolean {
        return this.answer == answer
    }

}