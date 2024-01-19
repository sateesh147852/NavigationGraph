package com.navigationgraph.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.navigationgraph.R
import com.navigationgraph.databinding.FragmentEditAccountBinding

class EditAccountFragment : Fragment() {

    private lateinit var binding: FragmentEditAccountBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditAccountBinding.inflate(inflater,container,false)
        return binding.root
    }
}