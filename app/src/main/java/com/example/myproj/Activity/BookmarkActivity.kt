package com.example.myproj.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myproj.R
import com.example.myproj.databinding.ActivityBookmarkBinding

class BookmarkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookmarkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookmarkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example clicks
        binding.tvBookmark1.setOnClickListener { /* TODO */ }
        binding.tvBookmark2.setOnClickListener { /* TODO */ }

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.nav_home -> startActivity(Intent(this, MainActivity::class.java))
                R.id.nav_explore -> startActivity(Intent(this, ExploreActivity::class.java))
                R.id.nav_bookmark -> true // already here
            }
            true
        }
    }
}
