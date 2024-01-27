package com.navigationgraph.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.navigationgraph.R
import com.navigationgraph.databinding.FragmentEditAccountBinding

class EditAccountFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentEditAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btSubmit.setOnClickListener {
            findNavController().navigate(R.id.edit_Account_dialog_to_second_activity)
        }
    }
}