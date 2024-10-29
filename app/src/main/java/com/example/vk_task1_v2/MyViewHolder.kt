package com.example.vk_task1_v2

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val image = view.findViewById<Button>(R.id.buttonNumbers)

    fun bind(number: Int) {
        image.text = "$number"
        val color = if (number % 2 == 0) {
            Color.RED
        } else {
            Color.BLUE
        }
        image.setBackgroundColor(color)
        image.setOnClickListener {
            val intent = Intent(itemView.context, MySecondActivity::class.java)
            intent.putExtra("ButtonColor", color)
            intent.putExtra("ButtonText", image.text)
            itemView.context.startActivity(intent)
        }
    }

}