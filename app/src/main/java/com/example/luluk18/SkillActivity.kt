package com.example.luluk18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SkillActivity : AppCompatActivity() {

    lateinit var skillView: RecyclerView
    lateinit var skillAdapter: skillAdapter
    val list = ArrayList<skilldata>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        skillView = findViewById(R.id.rvskill)
        skillView.layoutManager = LinearLayoutManager( this)

        list.add(skilldata("Kotlin", "Pemograman Android"))
        list.add(skilldata("Laravel", "Pemograman Web"))

        skillAdapter = skillAdapter(list)
        skillView.adapter = skillAdapter
    }
}