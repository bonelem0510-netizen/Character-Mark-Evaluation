package com.example.charactermarkevaluation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.charactermarkevaluation.ui.theme.CharacterMarkEvaluationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val gradeInput = findViewById<EditText>(R.id.editGrade)
        val resultText = findViewById<TextView>(R.id.textResult)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val resetButton = findViewById<Button>(R.id.btnReset)

        checkButton.setOnClickListener {
            val grade = gradeInput.text.toString().uppercase()

            if (grade == "A") {
                resultText.text = "Genius"
            }
            else if (grade == "B") {
                resultText.text = "Very Good"
            }
            else if (grade == "C") {
                resultText.text = "You tried"
            }
            else if (grade == "D"){
                resultText.text = "Did you even try"
            }
            else if (grade == "E"){
                resultText.text = "You are a failure"
            }
            else {
                resultText.text = "Not Accepted Input"
            }
        }
        resetButton.setOnClickListener {
            gradeInput.text.clear()
            resultText.text = "Result will appear here"
        }

        }
    }
