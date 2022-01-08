package com.navigationgraph.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.snackbar.Snackbar
import com.navigationgraph.R
import com.navigationgraph.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeData()
    }

    private fun initializeData() {
        binding.fab.setOnClickListener {
            Snackbar
                .make(it, "Message deleted", Snackbar.LENGTH_LONG)
                .setAction("Undo") { Toast.makeText(this@MainActivity, "Undo done", Toast.LENGTH_SHORT).show() }.show()
        }

        setSupportActionBar(binding.toolBar)
    }
}