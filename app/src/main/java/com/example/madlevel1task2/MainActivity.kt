package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val answers = arrayOf<String>("T", "F", "F", "F")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root) // Sets the activity layout resource file.
    }

    private fun checkAnswers() {
        if (binding.submission1.text.toString() == answers[0]
            && binding.submission2.text.toString() == answers[1]
            && binding.submission3.text.toString() == answers[2]
            && binding.submission4.text.toString() == answers[3]) {
            onAnswerCorrect()
        }
        else {
            onAnswerIncorrect()
        }
    }

    /**
     * Displays a successful Toast message.
     */
    private fun onAnswerCorrect() {
        val message = getString(R.string.correct)

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    /**
     * Displays an incorrect Toast message.
     */
    private fun onAnswerIncorrect() {
        val message = getString(R.string.incorrect)

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}