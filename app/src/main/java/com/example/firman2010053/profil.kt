package com.example.firman2010053

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firman2010053.databinding.ActivityProfilBinding

class profil : AppCompatActivity() {
    lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btny2.setOnClickListener{
            Toast.makeText( this,"menggunakan binding", Toast.LENGTH_LONG).show()
    }
    }
}