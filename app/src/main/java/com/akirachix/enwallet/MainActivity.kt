package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        display()

    }


    fun display() {
        val salary = Wallet("", "20,000", "20982", "1-3-2003")
        val rent = Wallet("", "80333", "93933", "3-4-2005")
        val electricity = Wallet("", "74747", "20039", "29-3-2008")
        val internet = Wallet("", "10,000", "40982", "1-3-2003")
        val shopping = Wallet("", "3893", "93933", "4-4-2005")
        val busfare = Wallet("", "4003", "20039", "9-3-2008")
        val waterbill = Wallet("", "30,000", "20982", "1-3-2003")

        val wallet = listOf(salary,rent,electricity,internet,shopping,busfare,waterbill)
        val walletAdapter = WalletsAdapter(wallet)
        binding.rvWallet.adapter = walletAdapter


    }
}