package com.navigationgraph.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.navigationgraph.databinding.FragmentConfirmationBinding

class ConfirmationFragment : Fragment() {

    private lateinit var binding: FragmentConfirmationBinding
    private var name: String? = null
    private var amount: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString("name")
            amount = it.getInt("amount")
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConfirmationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvAmount.text = amount.toString()
        binding.tvName.text = "was sent by $name"
    }
}