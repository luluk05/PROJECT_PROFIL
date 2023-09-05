package com.example.luluk18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    var listportofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listportofolio.add(
            PortofolioData(
            R.drawable.web, "Kasir Depot",
            "Sistem Manajemen Keungan Depot Air", "https://gitlab.com"
        )
        )

        listportofolio.add(
            PortofolioData(
            R.drawable.android, "LKS Android",
            "Project latihan", "https//github.com/luluk05"
        ))
        portofolioView = findViewById(R.id.rvPortofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listportofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter
    }
}