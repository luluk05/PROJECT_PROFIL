package com.example.luluk18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class hobbyActivity : AppCompatActivity() {

    lateinit var hobbyView: RecyclerView
    lateinit var hobbyAdapter: hobbyAdapter
    var list = ArrayList<hobbyData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        hobbyView = findViewById(R.id.rvhobby)
        hobbyView.layoutManager = LinearLayoutManager( this )

        list.add(hobbyData("Game", "Bermain Game"))
        list.add(hobbyData("__", "____"))

        hobbyAdapter = hobbyAdapter(list)
        hobbyView.adapter = hobbyAdapter
    }
}