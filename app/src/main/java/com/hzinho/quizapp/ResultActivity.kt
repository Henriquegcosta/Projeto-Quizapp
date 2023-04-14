package com.hzinho.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)
        val userName = intent.getStringExtra(Constants.USER_NAME)

        tvName.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text = "Sua pontuação foi $correctAnswers de $totalQuestions"

        btnFinish.setOnClickListener{
            val intent = Intent(this, QuizSelector::class.java)
            intent.putExtra(Constants.USER_NAME, userName.toString())
            startActivity(intent)
            finish()
        }
    }
}