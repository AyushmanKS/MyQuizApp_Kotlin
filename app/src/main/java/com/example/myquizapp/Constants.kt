package com.example.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String ="total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "India",
            "Sweden",
            1)
        questionsList.add(que1)

        val que2 = Question(2,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "India",
            "Sweden",
            2)
        questionsList.add(que2)

        val que3 = Question(3,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "Australia",
            "India",
            "Sweden",
            1)
        questionsList.add(que3)

        val que4 = Question(4,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belgium",
            "Australia",
            "India",
            "Brazil",
            4)
        questionsList.add(que4)

        val que5 = Question(5,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Belgium",
            "Australia",
            "Denmark",
            "Brazil",
            3)
        questionsList.add(que5)

        val que6 = Question(6,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Belgium",
            "Fiji",
            "India",
            "Brazil",
            2)
        questionsList.add(que6)

        val que7 = Question(7,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Australia",
            "India",
            "Brazil",
            1)
        questionsList.add(que7)

        val que8 = Question(8,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Belgium",
            "Australia",
            "India",
            "Brazil",
            3)
        questionsList.add(que8)

        val que9 = Question(9,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Belgium",
            "Kuwait",
            "India",
            "Brazil",
            2)
        questionsList.add(que4)

        val que10 = Question(10,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Belgium",
            "Australia",
            "New Zealand",
            "Brazil",
            3)
        questionsList.add(que10)

        return questionsList
    }
}