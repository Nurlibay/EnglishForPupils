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
            11 -> {
                firstQuestionVariants[0] = "Basketball is helpful"
                firstQuestionVariants[1] = "Because it is healthy"
                firstQuestionVariants[2] = "I go to the gym every other day"//
                firstQuestionVariants[3] = "Weekend is the best time"

                secondQuestionVariants[0] = "I like junk food"
                secondQuestionVariants[1] = "I always eat home-made food"//
                secondQuestionVariants[2] = "I eat at the restaurant "
                secondQuestionVariants[3] = "I like eating out"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            12 -> {
                firstQuestionVariants[0] = "I keep them at home"
                firstQuestionVariants[1] = "I feed them every 2 hours"
                firstQuestionVariants[2] = "I love pets"
                firstQuestionVariants[3] = "I have a cat"//

                secondQuestionVariants[0] = "I go there at the weekend"//
                secondQuestionVariants[1] = "I’m into going to the zoos"
                secondQuestionVariants[2] = "I feed animals there"
                secondQuestionVariants[3] = "It is interesting there"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            13 -> {
                firstQuestionVariants[0] = "I sleep 7 hours a day"
                firstQuestionVariants[1] = "I listen to music"//
                firstQuestionVariants[2] = "Because I study a lot"
                firstQuestionVariants[3] = "I feel tired very often"

                secondQuestionVariants[0] = "Because it grabs the attention"
                secondQuestionVariants[1] = "I did it with my brother"
                secondQuestionVariants[2] = "I use colorful paper"
                secondQuestionVariants[3] = "Yes, to my sister’s birthday"//

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            14 -> {
                firstQuestionVariants[0] = "I watch TV every evening"
                firstQuestionVariants[1] = "I feel entertained "
                firstQuestionVariants[2] = "I watch movies at home"
                firstQuestionVariants[3] = "Comedy and Fiction"//

                secondQuestionVariants[0] = "That sounds nice"//
                secondQuestionVariants[1] = "What time does it start?"
                secondQuestionVariants[2] = "I go very often"
                secondQuestionVariants[3] = "Do we need popcorn?"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            15 -> {
                firstQuestionVariants[0] = "Yes, to play games"
                firstQuestionVariants[1] = "Yes, to my study"//
                firstQuestionVariants[2] = "No, it is boring"
                firstQuestionVariants[3] = "I use my laptop to chat"

                secondQuestionVariants[0] = "Because it costs a lot"
                secondQuestionVariants[1] = "Without a doubt yes"//
                secondQuestionVariants[2] = "Sometimes with my headphones"
                secondQuestionVariants[3] = "I’m not keen on music"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            16 -> {
                firstQuestionVariants[0] = "To make models"
                firstQuestionVariants[1] = "I have science classes every Friday"
                firstQuestionVariants[2] = "Yes, it is an interesting subject"//
                firstQuestionVariants[3] = "It is sometimes dangerous"

                secondQuestionVariants[0] = "Yes, last week"//
                secondQuestionVariants[1] = "It is sometimes dangerous"
                secondQuestionVariants[2] = "It takes a lot of effort"
                secondQuestionVariants[3] = "I do in the science laboratory"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            17 -> {
                firstQuestionVariants[0] = "No, it is tiring"
                firstQuestionVariants[1] = "I paint for 2 hours"
                firstQuestionVariants[2] = "I write stories in my room"
                firstQuestionVariants[3] = "Yes, I can sing and dance"//

                secondQuestionVariants[0] = "Yes, especially nature"//
                secondQuestionVariants[1] = "Yes, it is interesting"
                secondQuestionVariants[2] = "No, I’m afraid"
                secondQuestionVariants[3] = "I draw every Monday"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            18 -> {
                firstQuestionVariants[0] = "Yes, I have pets"
                firstQuestionVariants[1] = "No, I’m afraid of animals"//
                firstQuestionVariants[2] = "I love animals in the zoo"
                firstQuestionVariants[3] = "Because it is a tiring job"

                secondQuestionVariants[0] = "I love teachers"
                secondQuestionVariants[1] = "Babysitting is difficult"
                secondQuestionVariants[2] = "Being a lawyer"//
                secondQuestionVariants[3] = "There are a lot of professions"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            19 -> {
                firstQuestionVariants[0] = "Because they’re informative"
                firstQuestionVariants[1] = "Ads last several minutes"
                firstQuestionVariants[2] = "I watch them online"
                firstQuestionVariants[3] = "Yes, I regularly watch them"//

                secondQuestionVariants[0] = "Yes, they are convenient"//
                secondQuestionVariants[1] = "I read e-books on the bus"
                secondQuestionVariants[2] = "I often read e-books"
                secondQuestionVariants[3] = "Because they ‘re time-saving"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
            }
            20 -> {
                firstQuestionVariants[0] = "Yes, it is essential"//
                firstQuestionVariants[1] = "In the art studio"
                firstQuestionVariants[2] = "Yes, it is difficult"
                firstQuestionVariants[3] = "While reading books "

                secondQuestionVariants[0] = "I’ve created many games"
                secondQuestionVariants[1] = "Yes, it is my talent"//
                secondQuestionVariants[2] = "Yes, it is important"
                secondQuestionVariants[3] = "No, it is difficult"

            questions.add(firstQuestionVariants)
            questions.add(secondQuestionVariants)
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
            11 -> {
                return mutableListOf(2, 1)
            }
            13 -> {
                return mutableListOf(1, 3)
            }
            14 -> {
                return mutableListOf(3,0)
            }
            15 -> {
                return mutableListOf(1, 1)
            }
            16 -> {
                return mutableListOf(2, 0)
            }
            17 -> {
                return mutableListOf(3, 0)
            }
            18 -> {
                return mutableListOf(1, 2)
            }
            19 -> {
                return mutableListOf(3, 1)
            }
            20 -> {
                return mutableListOf(0, 1)
            }
        }
        return mutableListOf()
    }
}
