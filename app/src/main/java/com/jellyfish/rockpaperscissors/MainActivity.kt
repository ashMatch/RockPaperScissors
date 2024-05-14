package com.jellyfish.rockpaperscissors

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var rockImage: ImageView
    lateinit var paperImage: ImageView
    lateinit var scissorsImage: ImageView
    lateinit var resultText: TextView
    lateinit var fightBtn: Button

    var userChoice: Short? = null
    var computerRandomChoice: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rockImage = findViewById(R.id.rockImg)
        paperImage = findViewById(R.id.paperImg)
        scissorsImage = findViewById(R.id.scissorsImg)
        resultText = findViewById(R.id.choseOneTitleText)
        fightBtn = findViewById(R.id.matchBtn)

        rockImage.setOnClickListener {
            userChoice = 1
            resultText.text = "You chose: ROCK"

        }

        paperImage.setOnClickListener {
            paperImage.setBackgroundColor(Color.BLUE)
            userChoice = 2
            resultText.text = "You chose: PAPER"
        }

        scissorsImage.setOnClickListener {
            userChoice = 3
            resultText.text = "You chose: SCISSORS"
        }

        fightBtn.setOnClickListener {
            computerRandomChoice = Random.nextInt(1,4)
            resultText.text = "$computerRandomChoice"
        }

    }
}