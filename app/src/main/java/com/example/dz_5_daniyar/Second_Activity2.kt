package com.example.dz_5_daniyar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_5_daniyar.databinding.ActivityMainBinding
import com.example.dz_5_daniyar.databinding.ActivitySecond2Binding

class Second_Activity2 : AppCompatActivity() {
    private lateinit var binding: ActivitySecond2Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val text = intent.getStringExtra("key")
        binding.editText2.text = text

        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
           intent.putExtra("iii",binding.editText2.text.toString())
            startActivity(intent)

        }




    }
}