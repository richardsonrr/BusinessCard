package com.richardson.dev.businesscard.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.richardson.dev.businesscard.R
import com.richardson.dev.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabAdd.setOnClickListener {
            val intent = Intent(this,AddCardActivity::class.java)
            startActivity(intent)

        }
    }
}