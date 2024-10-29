package com.example.vk_task1_v2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MySecondActivity: AppCompatActivity() {

    lateinit var buttonCard: ImageView
    lateinit var buttonText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_element)
        buttonCard = findViewById<ImageView>(R.id.ButtonCard)
        buttonText = findViewById<TextView>(R.id.TextCard)
        buttonCard.background = ColorDrawable(intent.getIntExtra("ButtonColor", Color.BLACK))
        buttonText.text = intent.getStringExtra("ButtonText")
    }
}