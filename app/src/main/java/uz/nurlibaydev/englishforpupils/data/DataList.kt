package uz.nurlibaydev.englishforpupils.data

object DataList {
    fun getAllUnits(): List<String> {
        val units = mutableListOf<String>()
        repeat(20) {
            units.add("Unit ${it + 1}")
        }
        return units
    }

    /** Categorize words screen data */
    fun getMatchingWordScreenThreeWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf("Age", "Looks", "Hair")
            }
        }
        return mutableListOf("", "", "")
    }

    fun getMatchingWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf(
                    "bald", "attractive", "blonde", "curly", "dark",
                    "elderly", "fair", "good-looking", "handsome",
                    "middle-aged", "pretty", "straight", "teenage", "in twenties"
                )
            }
        }
        return mutableListOf()
    }

    fun getMatchingWordsScreenLeftWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf("elderly", "middle-aged", "teenage", "in twenties")
            }
        }
        return mutableListOf()
    }

    fun getMatchingWordsScreenMiddleWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf("attractive", "good-looking", "handsome", "pretty")
            }
        }
        return mutableListOf()
    }

    fun getMatchingWordsScreenRightWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf("bald", "blonde", "curly", "dark", "fair", "straight")
            }
        }
        return mutableListOf()
    }

    /** Matching antonyms screen data */
    fun getAntonymsScreenLeftWord(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf(
                    "polite",
                    "careful",
                    "funny",
                    "miserable",
                    "friendly",
                    "confident",
                    "naughty",
                    "honest",
                    "hard-working",
                    "patient",
                    "cruel"
                )
            }
        }
        return mutableListOf()
    }

    fun getAntonymsScreenRightWord(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf(
                    "rude",
                    "careless ",
                    "serious",
                    "cheerful",
                    "unfriendly ",
                    "shy",
                    "well-behaved",
                    "dishonest",
                    "lazy",
                    "impatient",
                    "kind"
                )
            }
        }
        return mutableListOf()
    }

    /** Filling screen data */
    fun getFillingQuestions(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf(
                    "Young man------[wear] smart suits and skinny ties in 1960th",
                    "Clothing trends-----[match] the music",
                    "People----[dress] second-hand clothes",
                    "Teens----[be] in love with the look by 1990th"
                )
            }
        }
        return mutableListOf()
    }

    fun getFillingAnswers(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf("wore", "matched", "called", "were")
            }
        }
        return mutableListOf()
    }

    /** Word order screen data */
    fun getWordOrderWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> return mutableListOf("the", "clash", "bands", "were", "teenagers", "into", "like")
        }
        return mutableListOf()
    }

    fun getWordOrderAnswers(unitNumber: Int): String {
        when (unitNumber) {
            1 -> return "teenagers were like into the clash bands"
        }
        return ""
    }

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