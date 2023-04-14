package com.hzinho.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Que país pertence essa bandeira?",
            R.drawable.ic_flag_of_argentina,"Argentina","Austrália","Japão","Cuba", 1

        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Que país pertence essa bandeira?",
            R.drawable.ic_flag_of_belgium, "França", "Austria", "Belgica", "Alemanha", 3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Que país pertence essa bandeira?",
            R.drawable.ic_flag_of_australia, "Nova Zelândia", "Austrália", "Reino Unido", "Estados Unidos", 2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Que país pertence essa bandeira?",
            R.drawable.ic_flag_of_fiji, "Fiji", "Samoa", "Tuvalu", "Vanuatu", 1
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Que país pertece essa bandeira?",
            R.drawable.ic_flag_of_brazil, "Chile", "Colombia", "Peru", "Brazil", 4
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Que país pertece essa bandeira?",
            R.drawable.ic_flag_of_denmark, "Noruega", "Dinamarca", "Finlândia", "Suécia", 2
        )
        questionsList.add(que6)



        return questionsList
    }

}