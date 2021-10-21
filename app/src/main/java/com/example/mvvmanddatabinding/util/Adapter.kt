package com.example.mvvmanddatabinding.util

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.mvvmanddatabinding.R

@BindingAdapter(value = ["diceRoll"])
fun setDiceBackground(view: View,roll:Int){
    when(roll){
        1 -> view.setBackgroundResource(R.drawable.roll_one)
        2 -> view.setBackgroundResource(R.drawable.roll_two)
        3 -> view.setBackgroundResource(R.drawable.roll_three)
        4 -> view.setBackgroundResource(R.drawable.roll_four)
        5 -> view.setBackgroundResource(R.drawable.roll_five)
        6 -> view.setBackgroundResource(R.drawable.roll_six)
    }
}