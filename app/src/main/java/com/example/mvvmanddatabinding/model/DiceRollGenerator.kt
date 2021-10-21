package com.example.mvvmanddatabinding.model

class DiceRollGenerator {
    private val start = 1
    private val end = 6

    fun getDiceRoll() : Int {
        return (start..end).random()
    }
}