package com.celsoluiz73.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.celsoluiz73.bancomr.databinding.ActivityTranferenciaBinding

class Transferencia : AppCompatActivity() {

    private lateinit var binding: ActivityTranferenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTranferenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarTransferencia
        toolbar.title = "Transferência"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(260, 0, 260, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }





    }
}