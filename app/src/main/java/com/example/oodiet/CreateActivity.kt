package com.example.oodiet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)


        var btnLogin: Button = findViewById(R.id.btn_register)

        btnLogin.setOnClickListener {
            val intent = Intent(this@CreateActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        var btnCreate: TextView = findViewById(R.id.loginaccount)

        btnCreate.setOnClickListener {
            val intent = Intent(this@CreateActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }

}