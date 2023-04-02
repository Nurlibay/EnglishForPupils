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
                return mutableListOf("suggesting", "agreeing", "disagreeing")
            }
            9 -> {
                return mutableListOf("infinitive", "past simple", "past participle")
            }
            10 -> {
                return mutableListOf("server", "customer", "answers")
            }
            11 -> {
                return mutableListOf("body", "disease", "verb")
            }
            12 -> {
                return mutableListOf("birds", "mammals", "reptiles")
            }
            13 -> {
                return mutableListOf("positive", "negative", "neutral")
            }
            14 -> {
                return mutableListOf("TV", "film", "literature")
            }
            15 -> {
                return mutableListOf("apps", "commands", "nouns")
            }
            16 -> {
                return mutableListOf("noun", "verb", "phrasal verb")
            }
            17 -> {
                return mutableListOf("artist", "actor", "author")
            }
            18 -> {
                return mutableListOf("-er", "-or", "-ist")
            }
            19 -> {
                return mutableListOf("say", "tell", "speak")
            }
            20 -> {
                return mutableListOf("look", "see", "watch")
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
                    "what about…",
                    "how about…",
                    "we could…",
                    "shall we",
                    "couldn’t we..",
                    "good idea",
                    "sounds great",
                    "absolutely",
                    "you’re right",
                    "It’s true",
                    "exactly",
                    "not sure",
                    "no way",
                    "I disagree",
                    "not necessarily",
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
                    "and to drink",
                    "It’s your change",
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
                    "It’s your change",
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

    /** Filling screen data */
    fun getFillingQuestions(unitNumber: Int): MutableList<String> {
        when (unitNumber) {
            1 -> {
                return mutableListOf(
                    "Mum [ write] an email once a week",
                    "We [go] on a summer holiday every August",
                    "My brother [own] two cars.",
                    "Her aunt never [use] a wireless mouse",
                    "Dad [watch] TV most evenings"
                )
            }
            2 -> {
                return mutableListOf(
                    "Young man------[wear] smart suits and skinny ties in 1960th",
                    "Clothing trends-----[match] the music",
                    "People----[dress] second-hand clothes",
                    "Teens----[be] in love with the look by 1990th",
                    "Black American music----[call] hip hop"
                )
            }
            3 -> {
                return mutableListOf(
                    "Islam is [ clever] in the class",
                    "English isn’t a [ boring] subject.",
                    "A sports car is [expensive] than a normal car.",
                    "February is[short] than September.",
                    "My school is[big] in the town."
                )
            }
            4 -> {
                return mutableListOf(
                    "At this time yesterday I [watch] a cartoon",
                    "Islam [ play ] ice hockey yesterday at 5",
                    "His parents [ have] dinner an hour ago",
                    "Her friends [listen] to music last night",
                    "They [jog] yesterday at 6"
                )
            }
            5 -> {
                return mutableListOf(
                    "She [get] on the bus in the centre of the city.",
                    "My grandfather [read] a newspaper yesterday.",
                    "We [go] to the cinema last evening",
                    "He [send] flowers to his mother to her last birthday",
                    "They [ meet] with their friends two weeks ago"
                )
            }
            6 -> {
                return mutableListOf(
                    "Do you have [any,some] homework to do?",
                    "I have [no,some] homework to do so let's go out.",
                    "Would you like[ any, some] more tea?",
                    "We had so [many, much] fun.",
                    "I spent [much, many] days there."
                )
            }
            7 -> {
                return mutableListOf(
                    "We [have to, must] wear a uniform at work.",
                    "I [must,have to] tidy my room before I can go out.",
                    "I [have to, must] go to the doctor.",
                    "We [ must, have to] get up early tomorrow.",
                    "They [have to, must] follow the rules"
                )
            }
            8 -> {
                return mutableListOf(
                    "Look out! He [ be going to] break that glass.",
                    "I[ be going to] take a few exams at the end of the year.",
                    "She [be going to] to be an artist",
                    "We [ be going to] study Maths",
                    "They [ be going to] study abroad "
                )
            }
            9 -> {
                return mutableListOf(
                    "Their plane [ land]",
                    "I [ win] an award",
                    "We [ finish] practicing",
                    "I [ become] an expert at selling",
                    "He [write] a letter"
                )
            }
            10 -> {
                return mutableListOf(
                    "I [see] that film before.",
                    "She [lose] her keys",
                    "They [go] shopping",
                    "We [finish] Unit 9",
                    "He [ break] a cup"
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
}