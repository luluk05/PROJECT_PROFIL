package com.example.luluk18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnprofile: CardView = findViewById(R.id.profile)
        val btnfortofolio: CardView = findViewById(R.id.portofolio)
        val btnskill: CardView = findViewById(R.id.skill)
        val btneducation: CardView = findViewById(R.id.education)
        val btnhobi: CardView = findViewById(R.id.hobby)

        btnprofile.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        btnfortofolio.setOnClickListener {
            val intent = Intent(this,PortofolioActivity::class.java)
            startActivity(intent)
        }

        btnskill.setOnClickListener {
            val intent = Intent(this, SkillActivity::class.java)
            startActivity(intent)
        }

        btneducation.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        btnhobi.setOnClickListener {
            val intent = Intent(this, hobbyActivity::class.java)
            startActivity(intent)
        }
    }
}