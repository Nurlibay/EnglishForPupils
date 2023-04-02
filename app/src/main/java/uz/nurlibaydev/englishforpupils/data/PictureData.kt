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
            5 -> {
                firstQuestionVariants[0] = "Vandalism"
                firstQuestionVariants[1] = "Shoplifting"
                firstQuestionVariants[2] = "Pickpocketing"
                firstQuestionVariants[3] = "Hacking"

                secondQuestionVariants[0] = "Shoplifting"
                secondQuestionVariants[1] = "Vandalism"
                secondQuestionVariants[2] = "Pickpocketing"
                secondQuestionVariants[3] = "Hacking"

                thirdQuestionVariants[0] = "hacking"
                thirdQuestionVariants[1] = "burglary"
                thirdQuestionVariants[2] = "vandalism"
                thirdQuestionVariants[3] = "shoplifting"

                fourthQuestionVariants[0] = "Pickpocketing"
                fourthQuestionVariants[1] = "burglary"
                fourthQuestionVariants[2] = "vandalism"
                fourthQuestionVariants[3] = "shoplifting"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            6 -> {
                firstQuestionVariants[0] = "Graffiti"
                firstQuestionVariants[1] = "Green spaces"
                firstQuestionVariants[2] = "Crowds"
                firstQuestionVariants[3] = "Power cut"

                secondQuestionVariants[0] = "Power cut"
                secondQuestionVariants[1] = "Graffiti"
                secondQuestionVariants[2] = "Green spaces"
                secondQuestionVariants[3] = "Pollution"

                thirdQuestionVariants[0] = "Traffic jam"
                thirdQuestionVariants[1] = "Pollution"
                thirdQuestionVariants[2] = "crowds"
                thirdQuestionVariants[3] = "Power cut"

                fourthQuestionVariants[0] = "crowds"
                fourthQuestionVariants[1] = "Pollution"
                fourthQuestionVariants[2] = "Traffic jam"
                fourthQuestionVariants[3] = "Power cut"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            7 -> {
                firstQuestionVariants[0] = "Hang out"
                firstQuestionVariants[1] = "Look after"
                firstQuestionVariants[2] = "Make up"
                firstQuestionVariants[3] = "Come round"

                secondQuestionVariants[0] = "Come round"
                secondQuestionVariants[1] = "Make up"
                secondQuestionVariants[2] = "Hang out"
                secondQuestionVariants[3] = "Look after"

                thirdQuestionVariants[0] = "Look after"
                thirdQuestionVariants[1] = "Come round"
                thirdQuestionVariants[2] = "Make up"
                thirdQuestionVariants[3] = "Get on"

                fourthQuestionVariants[0] = "Get together"
                fourthQuestionVariants[1] = "Make up"
                fourthQuestionVariants[2] = "Look after"
                fourthQuestionVariants[3] = "Fall out"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            8 -> {
                firstQuestionVariants[0] = "Baggage hall"
                firstQuestionVariants[1] = "Security check"
                firstQuestionVariants[2] = "Boarding pass"
                firstQuestionVariants[3] = "Sign"

                secondQuestionVariants[0] = "Security check"
                secondQuestionVariants[1] = "Boarding pass"
                secondQuestionVariants[2] = "Baggage hall"
                secondQuestionVariants[3] = "Check-in desk"

                thirdQuestionVariants[0] = "Passport control"
                thirdQuestionVariants[1] = "Boarding pass"
                thirdQuestionVariants[2] = "Security check"
                thirdQuestionVariants[3] = "Departure gate"

                fourthQuestionVariants[0] = "Queue"
                fourthQuestionVariants[1] = "Passport control"
                fourthQuestionVariants[2] = "Boarding pass"
                fourthQuestionVariants[3] = "Departure gate"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            9 -> {
                firstQuestionVariants[0] = "Receipt"
                firstQuestionVariants[1] = "Change"
                firstQuestionVariants[2] = "Bank account"
                firstQuestionVariants[3] = "Price"

                secondQuestionVariants[0] = "Bank account"
                secondQuestionVariants[1] = "Receipt"
                secondQuestionVariants[2] = "Change"
                secondQuestionVariants[3] = "Checkout"

                thirdQuestionVariants[0] = "Save up"
                thirdQuestionVariants[1] = "Give away"
                thirdQuestionVariants[2] = "Change"
                thirdQuestionVariants[3] = "Checkout"

                fourthQuestionVariants[0] = "Give away"
                fourthQuestionVariants[1] = "Save up"
                fourthQuestionVariants[2] = "Change"
                fourthQuestionVariants[3] = "Special offer"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            10 -> {
                firstQuestionVariants[0] = "Frozen"
                firstQuestionVariants[1] = "Raw"
                firstQuestionVariants[2] = "Fresh"
                firstQuestionVariants[3] = "Sour"

                secondQuestionVariants[0] = "Raw"
                secondQuestionVariants[1] = "Fresh"
                secondQuestionVariants[2] = "Frozen"
                secondQuestionVariants[3] = "Bitter"

                thirdQuestionVariants[0] = "Spicy"
                thirdQuestionVariants[1] = "Raw"
                thirdQuestionVariants[2] = "Fresh"
                thirdQuestionVariants[3] = "Juicy"

                fourthQuestionVariants[0] = "Juicy"
                fourthQuestionVariants[1] = "Fresh"
                fourthQuestionVariants[2] = "Sweet"
                fourthQuestionVariants[3] = "Raw"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            11 -> {
                firstQuestionVariants[0] = "Headache"
                firstQuestionVariants[1] = "Flu"
                firstQuestionVariants[2] = "Fever"
                firstQuestionVariants[3] = "Earache"

                secondQuestionVariants[0] = "Flu"
                secondQuestionVariants[1] = "Earache"
                secondQuestionVariants[2] = "Toothache"
                secondQuestionVariants[3] = "Headache"

                thirdQuestionVariants[0] = "cheek"
                thirdQuestionVariants[1] = "Chest"
                thirdQuestionVariants[2] = "Chin"
                thirdQuestionVariants[3] = "Elbow"

                fourthQuestionVariants[0] = "Chin"
                fourthQuestionVariants[1] = "Chest"
                fourthQuestionVariants[2] = "Cheek"
                fourthQuestionVariants[3] = "Neck"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            12 -> {
                firstQuestionVariants[0] = "Mosquito"
                firstQuestionVariants[1] = "Fly"
                firstQuestionVariants[2] = "Ant"
                firstQuestionVariants[3] = "Butterly"

                secondQuestionVariants[0] = "Fly"
                secondQuestionVariants[1] = "Mosquito"
                secondQuestionVariants[2] = "Butterfly"
                secondQuestionVariants[3] = "Ant"

                thirdQuestionVariants[0] = "Ant"
                thirdQuestionVariants[1] = "Fly"
                thirdQuestionVariants[2] = "Bat"
                thirdQuestionVariants[3] = "Worm"

                fourthQuestionVariants[0] = "Worm"
                fourthQuestionVariants[1] = "Mosquito"
                fourthQuestionVariants[2] = "Fly"
                fourthQuestionVariants[3] = "bat"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            13 -> {
                firstQuestionVariants[0] = "Tired"
                firstQuestionVariants[1] = "Stressed"
                firstQuestionVariants[2] = "Disappointed"
                firstQuestionVariants[3] = "Relaxed"

                secondQuestionVariants[0] = "Scared"
                secondQuestionVariants[1] = "Brave"
                secondQuestionVariants[2] = "Stressed"
                secondQuestionVariants[3] = "Exhausted"

                thirdQuestionVariants[0] = "Proud"
                thirdQuestionVariants[1] = "Brave"
                thirdQuestionVariants[2] = "Amazed"
                thirdQuestionVariants[3] = "Grated"

                fourthQuestionVariants[0] = "Relaxed"
                fourthQuestionVariants[1] = "Stressed"
                fourthQuestionVariants[2] = "Hopeful"
                fourthQuestionVariants[3] = "Brave"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            14 -> {
                firstQuestionVariants[0] = "Science fiction"
                firstQuestionVariants[1] = "Action"
                firstQuestionVariants[2] = "Horror"
                firstQuestionVariants[3] = "Documentary"

                secondQuestionVariants[0] = "Chat show"
                secondQuestionVariants[1] = "Documentary"
                secondQuestionVariants[2] = "News"
                secondQuestionVariants[3] = "Science fiction"

                thirdQuestionVariants[0] = "Crime"
                thirdQuestionVariants[1] = "Action"
                thirdQuestionVariants[2] = "Documentary"
                thirdQuestionVariants[3] = "Horror"

                fourthQuestionVariants[0] = "Animation"
                fourthQuestionVariants[1] = "Documentary"
                fourthQuestionVariants[2] = "Action"
                fourthQuestionVariants[3] = "Science fiction"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            15 -> {
                firstQuestionVariants[0] = "Password"
                firstQuestionVariants[1] = "File"
                firstQuestionVariants[2] = "Virus"
                firstQuestionVariants[3] = "Link"

                secondQuestionVariants[0] = "Upload"
                secondQuestionVariants[1] = "Delete"
                secondQuestionVariants[2] = "Link"
                secondQuestionVariants[3] = "Share"

                thirdQuestionVariants[0] = "Share"
                thirdQuestionVariants[1] = "Delete"
                thirdQuestionVariants[2] = "Upload"
                thirdQuestionVariants[3] = "Search"

                fourthQuestionVariants[0] = "Delete"
                fourthQuestionVariants[1] = "Share"
                fourthQuestionVariants[2] = "Download"
                fourthQuestionVariants[3] = "File"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            16 -> {
                firstQuestionVariants[0] = "Pour"
                firstQuestionVariants[1] = "Blow"
                firstQuestionVariants[2] = "Fill"
                firstQuestionVariants[3] = "Stir"

                secondQuestionVariants[0] = "Stir"
                secondQuestionVariants[1] = "Blow"
                secondQuestionVariants[2] = "Pour"
                secondQuestionVariants[3] = "Shake"

                thirdQuestionVariants[0] = "Shake"
                thirdQuestionVariants[1] = "Blow"
                thirdQuestionVariants[2] = "Pour"
                thirdQuestionVariants[3] = "Juicy"

                fourthQuestionVariants[0] = "Tie"
                fourthQuestionVariants[1] = "Pour"
                fourthQuestionVariants[2] = "Shake"
                fourthQuestionVariants[3] = "Raw"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            17 -> {
                firstQuestionVariants[0] = "Art studio"
                firstQuestionVariants[1] = "Gallery"
                firstQuestionVariants[2] = "Sculpture"
                firstQuestionVariants[3] = "Painting"

                secondQuestionVariants[0] = "Audience"
                secondQuestionVariants[1] = "Studio"
                secondQuestionVariants[2] = "Novel"
                secondQuestionVariants[3] = "Gallery"

                thirdQuestionVariants[0] = "Painter"
                thirdQuestionVariants[1] = "Sculpture"
                thirdQuestionVariants[2] = "Gallery"
                thirdQuestionVariants[3] = "Poet"

                fourthQuestionVariants[0] = "Writer"
                fourthQuestionVariants[1] = "Novel"
                fourthQuestionVariants[2] = "Sculpture"
                fourthQuestionVariants[3] = "Studio"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            18 -> {
                firstQuestionVariants[0] = "Babysitter"
                firstQuestionVariants[1] = "Coach"
                firstQuestionVariants[2] = "Lawyer"
                firstQuestionVariants[3] = "Presenter"

                secondQuestionVariants[0] = "Pharmacist"
                secondQuestionVariants[1] = "Vet"
                secondQuestionVariants[2] = "Babysitter"
                secondQuestionVariants[3] = "Coach"

                thirdQuestionVariants[0] = "Vet"
                thirdQuestionVariants[1] = "Pharmacist"
                thirdQuestionVariants[2] = "Coach"
                thirdQuestionVariants[3] = "Doctor"

                fourthQuestionVariants[0] = "Lawyer"
                fourthQuestionVariants[1] = "Politician"
                fourthQuestionVariants[2] = "Journalist"
                fourthQuestionVariants[3] = "Builder"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            19 -> {
                firstQuestionVariants[0] = "Sticker"
                firstQuestionVariants[1] = "Poster"
                firstQuestionVariants[2] = "Note"
                firstQuestionVariants[3] = "Article"

                secondQuestionVariants[0] = "e-book"
                secondQuestionVariants[1] = "note"
                secondQuestionVariants[2] = "poster"
                secondQuestionVariants[3] = "advert"

                thirdQuestionVariants[0] = "Brochure"
                thirdQuestionVariants[1] = "Poster"
                thirdQuestionVariants[2] = "Note"
                thirdQuestionVariants[3] = "Sticker"

                fourthQuestionVariants[0] = "Poster"
                fourthQuestionVariants[1] = "Note"
                fourthQuestionVariants[2] = "Advert"
                fourthQuestionVariants[3] = "Paper"

                questions.add(firstQuestionVariants)
                questions.add(secondQuestionVariants)
                questions.add(thirdQuestionVariants)
                questions.add(fourthQuestionVariants)

                return questions
            }
            20 -> {
                firstQuestionVariants[0] = "Catch"
                firstQuestionVariants[1] = "Appear"
                firstQuestionVariants[2] = "Pay attention"
                firstQuestionVariants[3] = "Encourage"

                secondQuestionVariants[0] = "Encourage"
                secondQuestionVariants[1] = "Appear"
                secondQuestionVariants[2] = "Pay attention"
                secondQuestionVariants[3] = "Trick"

                thirdQuestionVariants[0] = "Trick"
                thirdQuestionVariants[1] = "Encourage"
                thirdQuestionVariants[2] = "Appear"
                thirdQuestionVariants[3] = "Catch"

                fourthQuestionVariants[0] = "Estimate"
                fourthQuestionVariants[1] = "Trick"
                fourthQuestionVariants[2] = "Catch"
                fourthQuestionVariants[3] = "Appear"

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
            5 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            6 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            7 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            8 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            9 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            10 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            11 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            12 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            13 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            14 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            15 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            16 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            17 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            18 -> {
                return mutableListOf(2, 1, 3, 2)
            }
            19 -> {
                return mutableListOf(0, 0, 0, 0)
            }
            20 -> {
                return mutableListOf(0, 0, 0, 0)
            }
        }
        return mutableListOf()
    }
}
