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
        binding.btAccount.setOnClickListener(this)
        binding.btBottomSheet.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {

            R.id.btAccount -> {
                findNavController().navigate(R.id.home_to_account_fragment)
            }

            R.id.btBottomSheet -> {
                findNavController().navigate(R.id.home_to_edit_Account)
            }
        }
    }
}