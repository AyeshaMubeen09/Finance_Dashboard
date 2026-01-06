package com.example.myproj.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myproj.R
import com.example.myproj.databinding.ActivityReferBinding

class ReferActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReferBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReferGet10.setOnClickListener {
            // TODO: Handle refer logic
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
