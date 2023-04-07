package uz.nurlibaydev.englishforpupils.data

object SpeakingData {

    fun getSpeakingScreenQuestions(unitNumber: Int): MutableList<HashMap<Int, String>> {
        val questions = mutableListOf<HashMap<Int, String>>()
        val firstQuestionVariants = HashMap<Int, String>()
        val secondQuestionVariants = HashMap<Int, String>()
        when (unitNumber) {
            1 -> {
                firstQuestionVariants[0] = "In my free time, I watch movies on YouTube"
                firstQuestionVariants[1] = "I am good at drawing and cooking"
                firstQuestionVariants[2] = "I usually go cycling once a week"
                firstQuestionVariants[3] = "I sometimes prefer being in the park"

                secondQuestionVariants[0] = "I always study in the evening"
                secondQuestionVariants[1] = "I often do my homework with my friend"
                secondQuestionVariants[2] = "I do my homework for about 2 hours"
                secondQuestionVariants[3] = "I prepare for my classes every day"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            2 -> {
                firstQuestionVariants[0] = "I buy clothes in central supermarkets"
                firstQuestionVariants[1] = "I do shopping at the weekends"
                firstQuestionVariants[2] = "I spent hours shopping every week"
                firstQuestionVariants[3] = "I do shopping because it is relaxing"

                secondQuestionVariants[0] = "My mother goes shopping together with me"
                secondQuestionVariants[1] = "My friend advises me on what to buy"
                secondQuestionVariants[2] = "My parents give me money for clothes."
                secondQuestionVariants[3] = "Juwap joq qaramayaqqoy"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            3 -> {
                firstQuestionVariants[0] = "I always spent time with my groupmates"
                firstQuestionVariants[1] = "I have enough time for entertainment"
                firstQuestionVariants[2] = "I prefer being alone to the company of people"
                firstQuestionVariants[3] = "I usually have spare time in the evening"

                secondQuestionVariants[0] = "Outdoors since I love being in nature"
                secondQuestionVariants[1] = "I choose to be with my friend Islam"
                secondQuestionVariants[2] = "Because it is important for my health"
                secondQuestionVariants[3] = "I have enough time for entertainment"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            4 -> {
                firstQuestionVariants[0] = "Football is a well-known sport"
                firstQuestionVariants[1] = "Basketball is easier than volleyball"
                firstQuestionVariants[2] = "Sport is an important activity"
                firstQuestionVariants[3] = "Juwap joq qaramayaqqoy"

                secondQuestionVariants[0] = "It was amazing"
                secondQuestionVariants[1] = "We went to the cinema in the evening"
                secondQuestionVariants[2] = "It started late"
                secondQuestionVariants[3] = "There were a lot of people"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            5 -> {
                firstQuestionVariants[0] = "I write it every other day"
                firstQuestionVariants[1] = "I wrote a letter to my friend yesterday"
                firstQuestionVariants[2] = "I usually spend 10 minutes"
                firstQuestionVariants[3] = "I write it on my way home"

                secondQuestionVariants[0] = "No. It is replaced by sending messages."
                secondQuestionVariants[1] = "Yes. It is better than calling"
                secondQuestionVariants[2] = "Yes. I write every day"
                secondQuestionVariants[3] = "No. It costs a lot"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            6 -> {
                firstQuestionVariants[0] = "I use it in the morning"
                firstQuestionVariants[1] = "I go to school by bus"
                firstQuestionVariants[2] = "I wait for it a lot"
                firstQuestionVariants[3] = "I catch a taxi"

                secondQuestionVariants[0] = "Yes, all the time"
                secondQuestionVariants[1] = "No, I can’t find"
                secondQuestionVariants[2] = "No, I always forget"
                secondQuestionVariants[3] = "Yes, every evening"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            7 -> {
                firstQuestionVariants[0] = "They find online"
                firstQuestionVariants[1] = "People have a lot of friends"
                firstQuestionVariants[2] = "Friends meet each other very often"
                firstQuestionVariants[3] = "They spend time together"

                secondQuestionVariants[0] = "Friends make me happy"
                secondQuestionVariants[1] = "I am always happy"
                secondQuestionVariants[2] = "Because it gives me energy"
                secondQuestionVariants[3] = "I feel happy at home"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            8 -> {
                firstQuestionVariants[0] = "I travel twice a year"
                firstQuestionVariants[1] = "I go Tashkent with my family"
                firstQuestionVariants[2] = "I travel with my friends"
                firstQuestionVariants[3] = "I love travelling"

                secondQuestionVariants[0] = "I use airplane"
                secondQuestionVariants[1] = "I always travel"
                secondQuestionVariants[2] = "I go away with my family"
                secondQuestionVariants[3] = "I go on holiday every summer"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            9 -> {
                firstQuestionVariants[0] = "It is my favorite activity"
                firstQuestionVariants[1] = "I go shopping every day"
                firstQuestionVariants[2] = "I prefer supermarkets"
                firstQuestionVariants[3] = "Because I feel relaxed"

                secondQuestionVariants[0] = "To buy my needs"
                secondQuestionVariants[1] = "By public transport"
                secondQuestionVariants[2] = "At the weekend"
                secondQuestionVariants[3] = "To shopping malls"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }
            10 -> {
                firstQuestionVariants[0] = "Yes, it is my hobby"
                firstQuestionVariants[1] = "I always cook dinner"
                firstQuestionVariants[2] = "It takes a lot of time"
                firstQuestionVariants[3] = "I often bake a cake"

                secondQuestionVariants[0] = "I cook three times a day"
                secondQuestionVariants[1] = "My mother helps me to cook"
                secondQuestionVariants[2] = "Because it is relaxing"
                secondQuestionVariants[3] = "I made salad yesterday"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)

                return questions
            }

        }
        return mutableListOf()
    }

    fun getSpeakingScreenAnswers(unitNumber: Int): MutableList<Int> {
        when (unitNumber) {
            1 -> {
                return mutableListOf(0, 0)
            }
            2 -> {
                return mutableListOf(0, 0)
            }
            3 -> {
                return mutableListOf(0, 0)
            }
            4 -> {
                return mutableListOf(0, 0)
            }
            5 -> {
                return mutableListOf(0, 0)
            }
            6 -> {
                return mutableListOf(0, 0)
            }
            7 -> {
                return mutableListOf(0, 0)
            }
            8 -> {
                return mutableListOf(0, 0)
            }
            9 -> {
                return mutableListOf(0, 0)
            }
            10 -> {
                return mutableListOf(0, 0)
            }
        }
        return mutableListOf()
    }
}
