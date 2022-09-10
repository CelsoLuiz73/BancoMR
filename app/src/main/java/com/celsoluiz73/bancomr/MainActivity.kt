package com.celsoluiz73.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.celsoluiz73.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSaldo.setOnClickListener {
            val intent = Intent(this, Saldo::class.java)
            startActivity(intent)
            finish()
        }

        binding.imgFatura.setOnClickListener {
            val intent = Intent(this, Faturas::class.java)
            startActivity(intent)
            finish()
        }

        binding.imgTransferencia.setOnClickListener {
            val intent = Intent(this, Transferencia::class.java)
            startActivity(intent)
            finish()
        }

        binding.imgPoupanca.setOnClickListener {
            val intent = Intent(this, Poupanca::class.java)
            startActivity(intent)
            finish()
        }
    }
}