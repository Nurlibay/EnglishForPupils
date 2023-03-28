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
                return mutableListOf("age", "looks", "hair")
            }
            2 -> {
                return mutableListOf("verb", "adverb ", "adjective")
            }
            3 -> {
                return mutableListOf("positive", "comparative", "superlative")
            }
            4 -> {
                return mutableListOf("indoor", "outdoor", "water")
            }
            5 -> {
                return mutableListOf("pronoun", "noun", "adverb")
            }
            6 -> {
                return mutableListOf("countable", "uncountable", "plural")
            }
            7 -> {
                return mutableListOf("have", "do", "make")
            }
            8 -> {
                return mutableListOf("suggesting ideas", "agreeing", "disagreeing")
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
            2 -> {
                return mutableListOf(
                    "badly", "politely", "well", "rudely", "healthily",
                    "honestly", "lazy", "serious", "trendy",
                    "careful", "casual", "skinny", "wear", "text", "make", "buy", "dress", "get"
                )
            }
            3 -> {
                return mutableListOf(
                    "great", "safe", "good", "far", "untidy",
                    "clever", "bigger", "easier", "worse",
                    "better", "harder", "cheaper", "best", "furthest", "longest", "oldest", "hardest", "latest"
                )
            }
            4 -> {
                return mutableListOf(
                    "boxing", "table tennis", "gymnastics", "yoga", "bowling squash", "cycling",
                    "climbing", "diving", "golf", "horse riding", "hiking",
                    "surfing", "windsurfing", "swimming", "kayaking", "fishing", "water-skiing"
                )
            }
            5 -> {
                return mutableListOf(
                    "itself", "herself", "each other", "myself", "yourselves", "himself",
                    "hacking", "vandal", "hacker", "burglary", "shoplifter", "thief",
                    "early", "soon", "suddenly", "luckily", "honestly", "well"
                )
            }
            6 -> {
                return mutableListOf(
                    "road sign", "rubbish bin", "bus stop", "apartment", "problem", "money",
                    "time", "petrol", "jam", "information", "electricity", "skyscrapers",
                    "neighborhoods", "cities", "people", "ideas", "buildings"
                )
            }
            7 -> {
                return mutableListOf(
                    "an argument", "a problem", "dinner", "fun", "a bath", "lots in common",
                    "a favor", "homework", "research", "work", "sport", "business",
                    "mistake", "noise", "friends", "angry", "choice", "the bed"
                )
            }
            8 -> {
                return mutableListOf(
                    "Why don’t we..", "What about…", "How about…", "We could…", "Shall we", "Couldn’t we..",
                    "That’s a good idea", "Sounds great", "Absolutely", "You’re right", "It’s true", "Exactly",
                    "I’m not sure", "No way", "I disagree", "Not necessarily", "I’m against", "I don’t agree"
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
            2 -> {
                return mutableListOf("wear", "text", "make", "buy", "dress", "get")
            }
            3 -> {
                return mutableListOf("great", "safe", "good", "far", "untidy", "clever")
            }
            4 -> {
                return mutableListOf("boxing", "table tennis", "gymnastics", "yoga", "bowling squash")
            }
            5 -> {
                return mutableListOf("itself", "herself", "each other", "myself", "yourselves", "himself")
            }
            6 -> {
                return mutableListOf("road sign", "rubbish bin", "bus stop", "apartment", "problem")
            }
            7 -> {
                return mutableListOf("an argument", "a problem", "dinner", "fun", "a bath", "lots in common")
            }
            8 -> {
                return mutableListOf("Why don’t we..", "What about…", "How about…", "We could…", "Shall we", "Couldn’t we..")
            }
        }
        return mutableListOf()
    }

    fun getMatchingWordsScreenMiddleWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf("attractive", "good-looking", "handsome", "pretty")
            }
            2 -> {
                return mutableListOf("badly", "politely", "well", "rudely", "healthily")
            }
            3 -> {
                return mutableListOf("bigger", "easier", "worse", "better", "harder", "cheaper")
            }
            4 -> {
                return mutableListOf("cycling", "climbing", "diving", "golf", "horse riding", "hiking")
            }
            5 -> {
                return mutableListOf("hacking", "vandal", "hacker", "burglary", "shoplifter", "thief")
            }
            6 -> {
                return mutableListOf("money", "time", "petrol", "jam", "information", "electricity")
            }
            7 -> {
                return mutableListOf("a favor", "homework", "research", "work", "sport", "business")
            }
            8 -> {
                return mutableListOf("That’s a good idea", "Sounds great", "Absolutely", "You’re right", "It’s true", "Exactly")
            }
        }
        return mutableListOf()
    }

    fun getMatchingWordsScreenRightWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf("bald", "blonde", "curly", "dark", "fair", "straight")
            }
            2 -> {
                return mutableListOf("lazy", "serious", "trendy", "careful", "casual", "skinny")
            }
            3 -> {
                return mutableListOf("best", "furthest", "longest", "oldest", "hardest", "latest")
            }
            4 -> {
                return mutableListOf("surfing", "windsurfing", "swimming", "kayaking", "fishing", "water-skiing")
            }
            5 -> {
                return mutableListOf("early", "soon", "suddenly", "luckily", "honestly", "well")
            }
            6 -> {
                return mutableListOf("skyscrapers", "neighborhoods", "cities", "people", "ideas", "buildings")
            }
            7 -> {
                return mutableListOf("mistake", "noise", "friends", "angry", "choice", "the bed")
            }
            8 -> {
                return mutableListOf("I’m not sure", "No way", "I disagree", "Not necessarily", "I’m against", "I don’t agree")
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