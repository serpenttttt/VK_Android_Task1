package com.example.vk_task1_v2

import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val text = view.findViewById<TextView>(R.id.text)
    val image = view.findViewById<ImageView>(R.id.image_view)

    fun bind(number: Int) {
        text.text = "$number"
        if (number % 2 == 0) {
            image.background = ColorDrawable(0xFFFF0000.toInt())
        }
        else {
            image.background = ColorDrawable(0xFF0000FF.toInt())
        }
    }


}