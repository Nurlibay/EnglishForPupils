package uz.nurlibaydev.englishforpupils.data

object WordOrderData {
    /** Word order screen data */
    fun getWordOrderWords(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> return mutableListOf("are","just","enough","Weekends","not")
            2 -> return mutableListOf("life", "busy", "now", "too", "Teenage", "is")
            3 -> return mutableListOf("going", "is", "How", "it")
            4 -> return mutableListOf("is", "computer", "into", "games", "He")
            5 -> return mutableListOf("Mate", "guess", "my", "I", "best", "he's")
            6 -> return mutableListOf("go", "we", "don’t", "out", "why")
            7 -> return mutableListOf("idea", "I", "with", "your", "agree", "completely")
            8 -> return mutableListOf("to go", "opinion", "it’s", "way", "my", "In", "the best")
            9 -> return mutableListOf("safe", "online", "isn’t", "Sometimes", "to shop", "it")
            10 -> return mutableListOf("18", "age of", "She", "a degree", "at the", "got")
            11 -> return mutableListOf("comes", "as", "me", "soon", "Call", "ass", "he")
            12 -> return mutableListOf("think", "exhibition", "do", "What", "you", "the", "new","about")
            13 -> return mutableListOf("eyes", "believe", "can’t", "I", "my")
            14 -> return mutableListOf("news", "create", "people", "fake", "some")
            15 -> return mutableListOf("you", "many", "speak", "How", "languages", "can")
            16 -> return mutableListOf("tickets", "I", "online", "cheap", "buy")
            17 -> return mutableListOf("into", "isn’t", "translated", "This", "Karakalpak", "film")
            18 -> return mutableListOf("dishes", "easily", "can", "We", "cook")
            19 -> return mutableListOf("you", "to", "It’s", "hear", "great", "from")
            20 -> return mutableListOf("warming up", "good", "for", "exercising", "before", "It’s")
        }
        return mutableListOf()
    }

    fun getWordOrderAnswers(unitNumber: Int): String {
        when (unitNumber) {
            1 -> return "Weekends are just not enough"
            2 -> return "Teenage life is too busy now"
            3 -> return "How is it going"
            4 -> return "He is into computer games"
            5 -> return "I guess he’s my best mate"
            6 -> return "Why don’t we go out"
            7 -> return "I completely agree with your idea"
            8 -> return "In my opinion, it’s the best way to go"
            9 -> return "Sometimes it isn’t safe to shop online"
            10 -> return "She got a degree at the age of 18"
            11 -> return "Call me as soon as he comes"
            12 -> return "What do you think about the new exhibition"
            13 -> return "I can’t believe my eyes"
            14 -> return "Some people create fake news"
            15 -> return "How many languages can you speak"
            16 -> return "I buy cheap tickets online"
            17 -> return "This film isn’t translated into Karakalpak"
            18 -> return "We can cook national dishes easily"
            19 -> return "It’s great to hear from you"
            20 -> return "It’s good for warming up before exercising"
        }
        return ""
    }
}