package org.techtown.sibalseki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import org.techtown.sibalseki.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    //2번에 필요한놈 lateinit = 레이트닛
//    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var diceImage1 = binding.dice1
        var diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {

            Toast.makeText(this, "주사위를 돌린다!", Toast.LENGTH_SHORT - 1).show()
            val result = Random().nextInt(6)
            val result2 = Random().nextInt(6)

            Log.i("램덤돌린다", result.toString())
            if (result == 1) {
                diceImage1.setImageResource(R.drawable.dice_1)

            } else if (result == 2) {
                diceImage1.setImageResource(R.drawable.dice_2)

            } else if (result == 3) {
                diceImage1.setImageResource(R.drawable.dice_3)

            } else if (result == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)

            } else if (result == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)

            } else {
                diceImage1.setImageResource(R.drawable.dice_6)

            }


            if (result2 == 1) {
                diceImage2.setImageResource(R.drawable.dice_1)

            } else if (result2 == 2) {
                diceImage2.setImageResource(R.drawable.dice_2)

            } else if (result2 == 3) {
                diceImage2.setImageResource(R.drawable.dice_3)

            } else if (result2 == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)

            } else if (result2 == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)

            } else {
                diceImage2.setImageResource(R.drawable.dice_6)

            }

        }
    }
}