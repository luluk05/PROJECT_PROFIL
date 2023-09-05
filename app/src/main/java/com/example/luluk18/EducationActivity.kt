package com.example.luluk18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: EducationAdapter
    val list = ArrayList<EducationData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rvEducation)
        educationView.layoutManager = LinearLayoutManager( this )

        list.add(EducationData("SDN TUGU 2", "Tugu, Kec. Sayung Kab.Demak"))
        list.add(EducationData("SMPN 3 SATU ATAP SAYUNG", "Tugu, Kec.Sayung Kab.Demak"))
        list.add(EducationData("SMKN 1 SAYUNG", "Jl. Raya Sayung Semarang Demak"))

        educationAdapter = EducationAdapter(list)
        educationView.adapter = educationAdapter
    }
}