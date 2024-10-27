package com.example.vk_task1_v2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MyActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var button: Button

    private var length = 0

    private val adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        button = findViewById(R.id.button)

        recyclerView.adapter = adapter

        button.setOnClickListener {
            adapter.addItems(adapter.itemCount + 1)
        }

        if (savedInstanceState != null) {
            var i = 1
            while (i <= savedInstanceState.getInt("length", length)) {
                adapter.addItems(i++)
            }
        } else {
            adapter.setItems(listOf())
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val length = adapter.saveItems()
        outState.putInt("length", length)
    }
}