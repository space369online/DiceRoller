package com.mcvector36.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //The first part
        //myFunction1()
        //The second part
        myFunction3()
    }
//The first part
    /**
    private fun myFunction1() {
    val rollButton: Button = findViewById(R.id.button)
    rollButton.setOnClickListener {
    //Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
    val resultText1: TextView = findViewById(R.id.textView1)
    val resultText2: TextView = findViewById(R.id.textView2)
    val dice1 = Dice(6)
    val dice2 = Dice(6)
    resultText1.text = dice1.roll().toString()
    resultText2.text = dice2.roll().toString()
    }
    }
     */

//The second part
    private fun myFunction3() {
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            myFunction2()
        }
    }

    private fun myFunction2() {
        val dice1 = Dice(6)
        val dice2 = Dice(6)
        val diceRoll1 = dice1.roll()
        val diceRoll2 = dice2.roll()

        // Find the ImageView in the layout
        val diceImage1: ImageView = findViewById(R.id.imageView1)

        val diceImage2: ImageView = findViewById(R.id.imageView2)




        // Update the ImageView with the correct drawable resource ID
        diceImage1.setImageResource(drawableResources(diceRoll1))

        // Update the content description
        diceImage1.contentDescription = diceRoll1.toString()

        diceImage2.setImageResource(drawableResources(diceRoll2))

        diceImage2.contentDescription = diceRoll2.toString()
    }

    // Determine which drawable resource ID to use based on the dice roll
    private fun drawableResources(diceRoll: Int):Int {
        val drawableResource = when(diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }
}
