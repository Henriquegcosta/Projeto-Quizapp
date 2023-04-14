package com.hzinho.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class QuizSelector : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_selector)

        val ivQuiz : ImageView = findViewById(R.id.iv_imageQuiz)
        val tvQuiz : TextView = findViewById(R.id.tv_result)


        val userName = intent.getStringExtra(Constants.USER_NAME)

        tvQuiz.text = "Ola $userName, escolha um Quiz"

        ivQuiz.setOnClickListener {
            val intent = Intent(this, GeographyQuiz::class.java)
            intent.putExtra(Constants.USER_NAME, userName.toString())
            startActivity(intent)
            finish()

        }




    }
}

