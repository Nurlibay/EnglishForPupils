package uz.nurlibaydev.englishforpupils.data

object PictureData {

    /** Picture screen data */

    fun getPictureScreenQuestions(unitNumber: Int): MutableList<HashMap<Int, String>> {
        val questions = mutableListOf<HashMap<Int, String>>()
        val firstQuestionVariants = HashMap<Int, String>()
        val secondQuestionVariants = HashMap<Int, String>()
        val thirdQuestionVariants = HashMap<Int, String>()
        val fourthQuestionVariants = HashMap<Int, String>()
        when (unitNumber) {
            1 -> {
                firstQuestionVariants[0] = "old"
                firstQuestionVariants[1] = "overweight"
                firstQuestionVariants[2] = "lazy"
                firstQuestionVariants[3] = "shy"

                secondQuestionVariants[0] = "sad"
                secondQuestionVariants[1] = "strict"
                secondQuestionVariants[2] = "friendly"
                secondQuestionVariants[3] = "kind"

                thirdQuestionVariants[0] = "kind"
                thirdQuestionVariants[1] = "happy"
                thirdQuestionVariants[2] = "patient"
                thirdQuestionVariants[3] = "serious"

                fourthQuestionVariants[0] = "elderly"
                fourthQuestionVariants[1] = "impatient"
                fourthQuestionVariants[2] = "intelligent"
                fourthQuestionVariants[3] = "introvert"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
        }
        return mutableListOf()
    }

    fun getPictureScreenAnswers(unitNumber: Int): MutableList<Int> {
        when (unitNumber) {
            1 -> {
                return mutableListOf(2, 1, 3, 2)
            }
        }
        return mutableListOf()
    }
}