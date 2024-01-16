package com.navigationgraph.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.navigationgraph.R
import com.navigationgraph.databinding.FragmentSpecifyAmountBinding

class SpecifyAmountFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentSpecifyAmountBinding
    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString("name")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSpecifyAmountBinding.inflate(inflater, container, false)
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
                    if (binding.etAmount.text.toString()
                            .isNotEmpty() && binding.etAmount.text.toString().toInt() > 0
                    ) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.homeFragment, false)
                            .build()
                        findNavController().navigate(
                            R.id.specify_amount_to_confirmation,
                            bundleOf(
                                "name" to name,
                                "amount" to binding.etAmount.text.toString().toInt()
                            ), navOptions
                        )
                    } else {
                        Toast.makeText(context, "Please give proper input", Toast.LENGTH_SHORT)
                            .show()
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