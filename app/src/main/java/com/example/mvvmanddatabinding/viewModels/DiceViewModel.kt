package com.example.mvvmanddatabinding.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmanddatabinding.model.DiceRollGenerator

class DiceViewModel : ViewModel(){
    private val diceRollGenerator = DiceRollGenerator()

    private val _currentRoll = MutableLiveData<Int>()
    val currentRoll: LiveData<Int> get() = _currentRoll

    fun getRandomDiceRoll(){
        _currentRoll.postValue(diceRollGenerator.getDiceRoll())
    }
}