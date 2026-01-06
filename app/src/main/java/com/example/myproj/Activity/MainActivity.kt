package com.example.myproj.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myproj.Adapter.TransactionAdapter
import com.example.myproj.Model.Transaction
import com.example.myproj.R
import com.example.myproj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var transactionAdapter: TransactionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // -----------------------
        // TOP BUTTONS
        // -----------------------
        binding.btnNotification.setOnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
        }
        binding.btnSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        // -----------------------
        // ACTION BUTTONS
        // -----------------------
        binding.btnDeposit.setOnClickListener {
            startActivity(Intent(this, DepositActivity::class.java))
        }
        binding.btnWithdraw.setOnClickListener {
            startActivity(Intent(this, WithdrawActivity::class.java))
        }
        binding.btnTransfer.setOnClickListener {
            startActivity(Intent(this, TransferActivity::class.java))
        }
        binding.btnGet10.setOnClickListener {
            startActivity(Intent(this, ReferActivity::class.java))
        }

        // -----------------------
        // TRANSACTIONS - Dummy Data
        // -----------------------
        val dummyTransactions = listOf(
            Transaction("Salary Credited", "Jan 1, 2026", 2500.0),
            Transaction("Grocery Shopping", "Jan 2, 2026", -120.5),
            Transaction("Transfer to John", "Jan 3, 2026", -300.0),
            Transaction("Received from Alice", "Jan 4, 2026", 150.0),
            Transaction("Electricity Bill", "Jan 5, 2026", -80.0)
        )

        transactionAdapter = TransactionAdapter(dummyTransactions)
        binding.recyclerTransactions.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = transactionAdapter
        }

        // -----------------------
        // BOTTOM NAVIGATION
        // -----------------------
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.nav_home -> true // already in home
                R.id.nav_explore -> {
                    startActivity(Intent(this, ExploreActivity::class.java))
                    true
                }
                R.id.nav_bookmark -> {
                    startActivity(Intent(this, BookmarkActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
