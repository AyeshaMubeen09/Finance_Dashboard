package com.example.myproj.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myproj.R
import com.example.myproj.databinding.ActivityDepositBinding

class DepositActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDepositBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDepositBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Submit deposit button
        binding.btnDepositSubmit.setOnClickListener {
            val amount = binding.etDepositAmount.text.toString()
            // TODO: Handle deposit logic here
        }

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.nav_home -> startActivity(Intent(this, MainActivity::class.java))
                R.id.nav_explore -> startActivity(Intent(this, ExploreActivity::class.java))
                R.id.nav_bookmark -> startActivity(Intent(this, BookmarkActivity::class.java))
            }
            true
        }
    }
}
