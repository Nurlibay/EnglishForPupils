package uz.nurlibaydev.englishforpupils.data

object SpeakingData {

    fun getSpeakingScreenQuestions(unitNumber: Int): MutableList<HashMap<Int, String>> {
        val questions = mutableListOf<HashMap<Int, String>>()
        val questionVariants = HashMap<Int, String>()
        when (unitNumber) {
            1 -> {
                questionVariants[0] = "In my free time, I watch movies on YouTube"
                questionVariants[1] = "I am good at drawing and cooking"
                questionVariants[2] = "I usually go cycling once a week"
                questionVariants[3] = "I sometimes prefer being in the park"
                questions.add(questionVariants)
                return questions
            }
            2 -> {
                questionVariants[0] = "I always study in the evening"
                questionVariants[1] = "I often do my homework with my friend"
                questionVariants[2] = "I do my homework for about 2 hours"
                questionVariants[3] = "I prepare for my classes every day"
                questions.add(questionVariants)
                return questions
            }
            3 -> {
                questionVariants[0] = ""
                questionVariants[1] = ""
                questionVariants[2] = ""
                questionVariants[3] = ""
                questions.add(questionVariants)
                return questions
            }
            4 -> {
                questionVariants[0] = ""
                questionVariants[1] = ""
                questionVariants[2] = ""
                questionVariants[3] = ""
                questions.add(questionVariants)
                return questions
            }
            5 -> {
                questionVariants[0] = ""
                questionVariants[1] = ""
                questionVariants[2] = ""
                questionVariants[3] = ""
                questions.add(questionVariants)
                return questions
            }
            6 -> {
                questionVariants[0] = ""
                questionVariants[1] = ""
                questionVariants[2] = ""
                questionVariants[3] = ""
                questions.add(questionVariants)
                return questions
            }
            7 -> {
                questionVariants[0] = ""
                questionVariants[1] = ""
                questionVariants[2] = ""
                questionVariants[3] = ""
                questions.add(questionVariants)
                return questions
            }
            8 -> {
                questionVariants[0] = ""
                questionVariants[1] = ""
                questionVariants[2] = ""
                questionVariants[3] = ""
                questions.add(questionVariants)
                return questions
            }
            9 -> {
                questionVariants[0] = ""
                questionVariants[1] = ""
                questionVariants[2] = ""
                questionVariants[3] = ""
                questions.add(questionVariants)
                return questions
            }
            10 -> {
                questionVariants[0] = ""
                questionVariants[1] = ""
                questionVariants[2] = ""
                questionVariants[3] = ""
                questions.add(questionVariants)
                return questions
            }

        }
        return mutableListOf()
    }

    fun getSpeakingScreenAnswers(unitNumber: Int): MutableList<Int> {
        when (unitNumber) {
            1 -> {
                return mutableListOf(0, 0, 0, 0)
            }
        }
        return mutableListOf()
    }
}
