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
            9 -> {
                return mutableListOf("Infinitive", "Past Simple", "Past Participle")
            }
            10 -> {
                return mutableListOf("Server’s phrases", "Customer’s phrases", "Answers")
            }
            11 -> {
                return mutableListOf("Body", "Disease", "Verb")
            }
            12 -> {
                return mutableListOf("Birds", "Mammals", "Reptiles")
            }
            13 -> {
                return mutableListOf("Positive", "Negative", "Neutral")
            }
            14 -> {
                return mutableListOf("TV", "Film", "Literature")
            }
            15 -> {
                return mutableListOf("Apps", "Commands", "Nouns")
            }
            16 -> {
                return mutableListOf("Noun", "Verb", "Phrasal verb")
            }
            17 -> {
                return mutableListOf("Artist", "Actor", "Author")
            }
            18 -> {
                return mutableListOf("-er", "-or", "-ist")
            }
            19 -> {
                return mutableListOf("Say", "Tell", "Speak")
            }
            20 -> {
                return mutableListOf("Look", "See", "Watch")
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
                    "great",
                    "safe",
                    "good",
                    "far",
                    "untidy",
                    "clever",
                    "bigger",
                    "easier",
                    "worse",
                    "better",
                    "harder",
                    "cheaper",
                    "best",
                    "furthest",
                    "longest",
                    "oldest",
                    "hardest",
                    "latest"
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
                    "Why don’t we..",
                    "What about…",
                    "How about…",
                    "We could…",
                    "Shall we",
                    "Couldn’t we..",
                    "That’s a good idea",
                    "Sounds great",
                    "Absolutely",
                    "You’re right",
                    "It’s true",
                    "Exactly",
                    "I’m not sure",
                    "No way",
                    "I disagree",
                    "Not necessarily",
                    "I’m against",
                    "I don’t agree"
                )
            }
            9 -> {
                return mutableListOf(
                    "Break", "Begin", "Eat", "Think", "Throw", "Sell",
                    "Built", "Got", "Began", "Lent", "Told", "Wrote",
                    "Drawn", "Known", "Rung", "Seen", "Stolen", "Thrown"
                )
            }
            10 -> {
                return mutableListOf(
                    "And to drink",
                    "Here’s your change",
                    "What can I get you",
                    "What to eat",
                    "Eat in or take out",
                    "Anything else",
                    "I’d like..",
                    "Have you got",
                    "Could I have..",
                    "I’ll have",
                    "Can I have",
                    "I’d like..",
                    "Of course",
                    "Sure",
                    "Ok",
                    "No,thanks",
                    "Yes",
                    "No"
                )
            }
            11 -> {
                return mutableListOf(
                    "Cheek", "thumb", "chin", "back", "throat", "forehead",
                    "Fever", "flu", "cough", "toothache", "cold", "stomachache",
                    "Break", "catch", "feel", "injure", "damage", "get"
                )
            }
            12 -> {
                return mutableListOf(
                    "Eagle", "pigeon", "swallow", "ostrich", "parrot", "sawn",
                    "Ox", "monkey", "tiger", "polar", "bear", "horse", "puma",
                    "Crocodile", "tortoise", "lizard", "snake", "varan", "cobra"
                )
            }
            13 -> {
                return mutableListOf(
                    "Open-minded", "Grateful", "loyal", "respectful", "organized", "ambitious",
                    "Arrogant", "boring", "aggressive", "bossy", "cruel", "rude",
                    "Dreamy", "quite", "casual", "private", "positive", "optimistic"
                )
            }
            14 -> {
                return mutableListOf(
                    "Channel BBC", "reality show", "chat show", "the news",
                    "Horror", "soap opera", "comedy", "drama", "action", "sci-fi",
                    "Plot", "poetry", "prose", "novel", "composition", "story"
                )
            }
            15 -> {
                return mutableListOf(
                    "WordPower", "Newscast", "Themez", "LanguageLab", "GrammarWise", "Duolingo",
                    "Delete", "share", "download", "upload", "install", "add",
                    "Password", "virus", "links", "file", "app", "button"
                )
            }
            16 -> {
                return mutableListOf(
                    "Tissue", "towel", "bottom", "bottle", "cardboard", "can",
                    "Rub", "blow", "cover", "stir", "pour", "shake",
                    "Add up", "blow up", "carry out", "work out", "cut up", "take away"
                )
            }
            17 -> {
                return mutableListOf(
                    "Cartoonist", "sculpture", "design", "painting", "art", "studio", "gallery",
                    "Film", "setting", "audience", "perform", "director", "special", "effect",
                    "Poem", "writer", "biography", "novel", "publish", "poet"
                )
            }
            18 -> {
                return mutableListOf(
                    "Blog", "clean", "goalkeep", "run", "teach", "build",
                    "Act", "compete", "direct", "visit", "conduct",
                    "Art", "guitar", "journal", "novel", "reception", "biology"
                )
            }
            19 -> {
                return mutableListOf(
                    "A word  nothing",
                    "yes/no",
                    "hello",
                    "sorry",
                    "thank you",
                    "A secret",
                    "joke",
                    "the truth",
                    "your name",
                    "the difference",
                    "the time",
                    "At the meeting",
                    "in public",
                    "with an accent",
                    "English",
                    "like a native",
                    "at length"
                )
            }
            20 -> {
                return mutableListOf(
                    "Carefully", "through", "up", "after", "at", "for",
                    "You soon", "you later", "the light", "the future", "the problem",
                    "TV", "DVD", "film", "football", "match"
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
                return mutableListOf(
                    "boxing",
                    "table tennis",
                    "gymnastics",
                    "yoga",
                    "bowling squash"
                )
            }
            5 -> {
                return mutableListOf(
                    "itself",
                    "herself",
                    "each other",
                    "myself",
                    "yourselves",
                    "himself"
                )
            }
            6 -> {
                return mutableListOf("road sign", "rubbish bin", "bus stop", "apartment", "problem")
            }
            7 -> {
                return mutableListOf(
                    "an argument",
                    "a problem",
                    "dinner",
                    "fun",
                    "a bath",
                    "lots in common"
                )
            }
            8 -> {
                return mutableListOf(
                    "Why don’t we..",
                    "What about…",
                    "How about…",
                    "We could…",
                    "Shall we",
                    "Couldn’t we.."
                )
            }
            9 -> {
                return mutableListOf("Break", "Begin", "Eat", "Think", "Throw", "Sell")
            }
            10 -> {
                return mutableListOf(
                    "And to drink",
                    "Here’s your change",
                    "What can I get you",
                    "What to eat",
                    "Eat in or take out",
                    "Anything else"
                )
            }
            11 -> {
                return mutableListOf("Cheek", "thumb", "chin", "back", "throat", "forehead")
            }
            12 -> {
                return mutableListOf("Eagle", "pigeon", "swallow", "ostrich", "parrot", "sawn")
            }
            13 -> {
                return mutableListOf(
                    "Open-minded",
                    "Grateful",
                    "loyal",
                    "respectful",
                    "organized",
                    "ambitious"
                )
            }
            14 -> {
                return mutableListOf("Channel BBC", "reality show", "chat show", "the news")
            }
            15 -> {
                return mutableListOf(
                    "WordPower",
                    "Newscast",
                    "Themez",
                    "LanguageLab",
                    "GrammarWise",
                    "Duolingo",
                )
            }
            16 -> {
                return mutableListOf("Tissue", "towel", "bottom", "bottle", "cardboard", "can")
            }
            17 -> {
                return mutableListOf(
                    "Cartoonist",
                    "sculpture",
                    "design",
                    "painting",
                    "art",
                    "studio",
                    "gallery"
                )
            }
            18 -> {
                return mutableListOf("Blog", "clean", "goalkeep", "run", "teach", "build")
            }
            19 -> {
                return mutableListOf("A word  nothing", "yes/no", "hello", "sorry", "thank you")
            }
            20 -> {
                return mutableListOf("Carefully", "through", "up", "after", "at", "for")
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
                return mutableListOf(
                    "cycling",
                    "climbing",
                    "diving",
                    "golf",
                    "horse riding",
                    "hiking"
                )
            }
            5 -> {
                return mutableListOf(
                    "hacking",
                    "vandal",
                    "hacker",
                    "burglary",
                    "shoplifter",
                    "thief"
                )
            }
            6 -> {
                return mutableListOf("money", "time", "petrol", "jam", "information", "electricity")
            }
            7 -> {
                return mutableListOf("a favor", "homework", "research", "work", "sport", "business")
            }
            8 -> {
                return mutableListOf(
                    "That’s a good idea",
                    "Sounds great",
                    "Absolutely",
                    "You’re right",
                    "It’s true",
                    "Exactly"
                )
            }
            9 -> {
                return mutableListOf("Built", "Got", "Began", "Lent", "Told", "Wrote")
            }
            10 -> {
                return mutableListOf(
                    "I’d like..",
                    "Have you got",
                    "Could I have..",
                    "I’ll have",
                    "Can I have",
                    "I’d like.."
                )
            }
            11 -> {
                return mutableListOf("Fever", "flu", "cough", "toothache", "cold", "stomachache")
            }
            12 -> {
                return mutableListOf("Ox", "monkey", "tiger", "polar", "bear", "horse", "puma")
            }
            13 -> {
                return mutableListOf("Arrogant", "boring", "aggressive", "bossy", "cruel", "rude")
            }
            14 -> {
                return mutableListOf("Horror", "soap opera", "comedy", "drama", "action", "sci-fi")
            }
            15 -> {
                return mutableListOf("Delete", "share", "download", "upload", "install", "add")
            }
            16 -> {
                return mutableListOf("Rub", "blow", "cover", "stir", "pour", "shake")
            }
            17 -> {
                return mutableListOf(
                    "Film",
                    "setting",
                    "audience",
                    "perform",
                    "director",
                    "special",
                    "effect"
                )
            }
            18 -> {
                return mutableListOf("Act", "compete", "direct", "visit", "conduct")
            }
            19 -> {
                return mutableListOf(
                    "A secret",
                    "joke",
                    "the truth",
                    "your name",
                    "the difference",
                    "the time"
                )
            }
            20 -> {
                return mutableListOf(
                    "You soon",
                    "you later",
                    "the light",
                    "the future",
                    "the problem"
                )
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
                return mutableListOf(
                    "surfing",
                    "windsurfing",
                    "swimming",
                    "kayaking",
                    "fishing",
                    "water-skiing"
                )
            }
            5 -> {
                return mutableListOf("early", "soon", "suddenly", "luckily", "honestly", "well")
            }
            6 -> {
                return mutableListOf(
                    "skyscrapers",
                    "neighborhoods",
                    "cities",
                    "people",
                    "ideas",
                    "buildings"
                )
            }
            7 -> {
                return mutableListOf("mistake", "noise", "friends", "angry", "choice", "the bed")
            }
            8 -> {
                return mutableListOf(
                    "I’m not sure",
                    "No way",
                    "I disagree",
                    "Not necessarily",
                    "I’m against",
                    "I don’t agree"
                )
            }
            9 -> {
                return mutableListOf("Drawn", "Known", "Rung", "Seen", "Stolen", "Thrown")
            }
            10 -> {
                return mutableListOf(
                    "Of course",
                    "Sure",
                    "Ok",
                    "No,thanks",
                    "Yes",
                    "No"
                )
            }
            11 -> {
                return mutableListOf("Break", "catch", "feel", "injure", "damage", "get")
            }
            12 -> {
                return mutableListOf("Crocodile", "tortoise", "lizard", "snake", "varan", "cobra")
            }
            13 -> {
                return mutableListOf(
                    "Dreamy",
                    "quite",
                    "casual",
                    "private",
                    "positive",
                    "optimistic"
                )
            }
            14 -> {
                return mutableListOf("Plot", "poetry", "prose", "novel", "composition", "story")
            }
            15 -> {
                return mutableListOf("Password", "virus", "links", "file", "app", "button")
            }
            16 -> {
                return mutableListOf(
                    "Add up",
                    "blow up",
                    "carry out",
                    "work out",
                    "cut up",
                    "take away"
                )
            }
            17 -> {
                return mutableListOf("Poem", "writer", "biography", "novel", "publish", "poet")
            }
            18 -> {
                return mutableListOf("Art", "guitar", "journal", "novel", "reception", "biology")
            }
            19 -> {
                return mutableListOf(
                    "At the meeting",
                    "in public",
                    "with an accent",
                    "English",
                    "like a native",
                    "at length"
                )
            }
            20 -> {
                return mutableListOf("TV", "DVD", "film", "football", "match")
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
            2 -> {
                return mutableListOf(
                    "Comfortable",
                    "Brand new",
                    "Formal",
                    "Loose-fitting",
                    "Well-dressed",
                    "Colourful",
                    "tight-fitting",
                    "politely",
                    "heavily",
                    "badly"
                )
            }
            3 -> {
                return mutableListOf(
                    "Huge",
                    "Unbelievable",
                    "Awful",
                    "Funny",
                    "Normal",
                    "Past",
                    "Same",
                    "Get a job",
                    "Start school",
                    "Divorced",
                )
            }
            4 -> {
                return mutableListOf(
                    "Healthy",
                    "Long",
                    "Correct",
                    "Strong",
                    "Open",
                    "Win",
                    "Wear",
                    "Never",
                    "Dark",
                    "Everyone"
                )
            }
            5 -> {
                return mutableListOf(
                    "Compulsory",
                    "Loud",
                    "Legal",
                    "Fair",
                    "Online",
                    "Start",
                    "Strange",
                    "Full",
                    "Late",
                    "Luckily"
                )
            }
            6 -> {
                return mutableListOf(
                    "City",
                    "Inside",
                    "Catch",
                    "Cold",
                    "Old",
                    "Dirty",
                    "Support",
                    "Positive",
                    "crime",
                    "credible"
                )
            }
            7 -> {
                return mutableListOf(
                    "Correct",
                    "Friend",
                    "Separately",
                    "Fair",
                    "Dependent",
                    "Weekend",
                    "Somewhere",
                    "Youth",
                    "Necessary",
                    "answer"
                )
            }
            8 -> {
                return mutableListOf(
                    "Check in",
                    "Modern",
                    "Dress",
                    "Well-known",
                    "Specific",
                    "Verbal",
                    "Agreement",
                    "Real",
                    "Include",
                    "Before"
                )
            }
            9 -> {
                return mutableListOf(
                    "Full price",
                    "Purchase",
                    "Problem",
                    "Regularly",
                    "Carefully",
                    "Expensive",
                    "Except",
                    "Interesting",
                    "Beginning",
                    "Save",
                )
            }
            10 -> {
                return mutableListOf(
                    "Sweet",
                    "Tasty",
                    "Appear",
                    "Disgusting",
                    "light",
                    " low-quality",
                    "giant",
                    " eat in",
                    "international",
                    "traditional",
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
            2 -> {
                return mutableListOf(
                    "uncomfortable",
                    "second-hand",
                    "casual",
                    "skinny",
                    "badly-dresses",
                    "plain",
                    "baggy",
                    "rudely",
                    "easily",
                    "well"
                )
            }
            3 -> {
                return mutableListOf(
                    "tiny",
                    "believable",
                    "wonderful",
                    "serious",
                    "abnormal",
                    "present",
                    "different",
                    "be fired",
                    "leave school",
                    "get married"
                )
            }
            4 -> {
                return mutableListOf(
                    "unhealthy",
                    "short",
                    "incorrect",
                    "weak",
                    "closed",
                    "lose",
                    "take off",
                    "always",
                    "light",
                    "noone",
                )
            }
            5 -> {
                return mutableListOf(
                    "optional",
                    "quiet",
                    "illegal",
                    "unfair",
                    "offline",
                    "finish",
                    "ordinary",
                    "empty",
                    "early",
                    "unfortunately"
                )
            }
            6 -> {
                return mutableListOf(
                    "suburb",
                    "outside",
                    "miss",
                    "hot",
                    "young",
                    "clean",
                    "discourage",
                    "negative",
                    "punishment",
                    "incredible"
                )
            }
            7 -> {
                return mutableListOf(
                    "wrong",
                    "enemy",
                    "together",
                    "unfair",
                    "independent",
                    "week day",
                    "nowhere",
                    "elderly",
                    "unnecessary",
                    "ask",
                )
            }
            8 -> {
                return mutableListOf(
                    "check out",
                    "antique",
                    "undress",
                    "unknown",
                    "non-specific",
                    "non-verbal",
                    "disagreement",
                    "unreal",
                    "exclude",
                    "after",
                )
            }
            9 -> {
                return mutableListOf(
                    "half price",
                    "sell",
                    "solution",
                    "not often",
                    "carelessly",
                    "inexpensive",
                    "including",
                    "dull",
                    "end",
                    "spent",
                )
            }
            10 -> {
                return mutableListOf(
                    "sour",
                    "tasteless",
                    "disappear",
                    "delicious",
                    "dark",
                    "high-quality",
                    "very small",
                    "take out",
                    "local",
                    "modern"
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