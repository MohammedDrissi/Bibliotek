package com.example.bibliotek

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class BookArt : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_art_books)
        val tanmyaBacharya = findViewById<Button>(R.id.menschliche_entwicklung_button)
        tanmyaBacharya.setOnClickListener {
            val intent = Intent(this, Tanmya_bachary_page::class.java)
            startActivity(intent)
        }
        val historicButton = findViewById<Button>(R.id.geschichte_button)
        historicButton.setOnClickListener {
            val intent = Intent(this, historic_page::class.java)
            startActivity(intent)
        }

    }
}