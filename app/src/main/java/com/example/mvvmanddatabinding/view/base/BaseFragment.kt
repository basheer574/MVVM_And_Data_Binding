package com.example.mvvmanddatabinding.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.mvvmanddatabinding.R

abstract class BaseFragment<VDB : ViewDataBinding>
    (@LayoutRes private val layoutResId : Int) : Fragment() {
    private lateinit var _binding: VDB
    val binding get() = _binding

    abstract  val bindingInflater:(LayoutInflater, Int ,ViewGroup? , Boolean )-> VDB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater,layoutResId,container,false)
        _binding.lifecycleOwner = viewLifecycleOwner
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }
    abstract fun setup()
}
