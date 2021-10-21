package com.example.mvvmanddatabinding.view.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.mvvmanddatabinding.R
import com.example.mvvmanddatabinding.databinding.FragmentDiceBinding
import com.example.mvvmanddatabinding.view.base.BaseFragment
import com.example.mvvmanddatabinding.viewModels.DiceViewModel

class DiceFragment : BaseFragment<FragmentDiceBinding>(R.layout.fragment_dice) {


    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) ->
    FragmentDiceBinding = DataBindingUtil::inflate

    private val viewModel:DiceViewModel by viewModels()

    override fun setup() {
        binding.apply {
            viewModelXml = viewModel
            lifecycleOwner = viewLifecycleOwner
        }
    }
}