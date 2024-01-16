package com.navigationgraph.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.navigationgraph.R
import com.navigationgraph.databinding.FragmentRecipientBinding

class RecipientFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentRecipientBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRecipientBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btSend.setOnClickListener(this)
        binding.btCancel.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        view?.let {
            when (it.id) {
                R.id.btSend -> {
                    if (binding.etName.text.toString().isEmpty()) {
                        Toast.makeText(context, "Please enter your name", Toast.LENGTH_SHORT).show()
                    } else {
                        findNavController().navigate(
                            R.id.recipent_to_specifyAmount,
                            bundleOf("name" to binding.etName.text.toString())
                        )
                    }
                }

                R.id.btCancel -> {
                    findNavController().popBackStack()
                }
                else -> {}
            }
        }
    }
}