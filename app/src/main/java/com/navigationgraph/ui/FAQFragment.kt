package com.navigationgraph.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.navigationgraph.databinding.FragmentFAQBinding

class FAQFragment : Fragment() {

    private lateinit var binding: FragmentFAQBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFAQBinding.inflate(inflater, container, false)
        return binding.root
    }
}