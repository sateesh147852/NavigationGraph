package com.navigationgraph.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.navigationgraph.R
import com.navigationgraph.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvViewBalance.setOnClickListener(this)
        binding.tvSendMoney.setOnClickListener(this)
        binding.tvTransactions.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        view?.let {
            when (view.id) {
                R.id.tvViewBalance -> {
                    findNavController().navigate(R.id.home_to_viewBalance)
                }

                R.id.tvSendMoney -> {
                    findNavController().navigate(R.id.home_to_recipient)
                }

                R.id.tvTransactions -> {
                    findNavController().navigate(R.id.home_to_transaction)
                }
            }
        }
    }
}