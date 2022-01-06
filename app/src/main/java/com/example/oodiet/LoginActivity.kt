package com.example.oodiet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin: Button = findViewById(R.id.login)

        btnLogin.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }

        var btnCreate: TextView = findViewById(R.id.createaccount)

        btnCreate.setOnClickListener {
            val intent = Intent(this@LoginActivity, CreateActivity::class.java)
            startActivity(intent)
        }
    }
}