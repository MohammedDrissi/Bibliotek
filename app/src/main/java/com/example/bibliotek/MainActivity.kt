package com.example.bibliotek

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cateButton=findViewById<Button>(R.id.category_button)
        cateButton.setOnClickListener {
            val intent= Intent(this, BookArt::class.java)
            startActivity(intent)
        }
        val searchButton =findViewById<Button>(R.id.search_button)
        searchButton.setOnClickListener {
            val intent =Intent(this,search_page::class.java)
            startActivity(intent)
        }




    }
}