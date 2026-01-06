package com.example.myproj.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myproj.R
import com.example.myproj.databinding.ActivityTransferBinding

class TransferActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransferBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Submit transfer button
        binding.btnTransferSubmit.setOnClickListener {
            val recipient = binding.etTransferTo.text.toString()
            val amount = binding.etTransferAmount.text.toString()
            // TODO: Handle transfer logic here
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
