package com.example.luluk18

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EducationAdapter(private val list: ArrayList<EducationData>):
    RecyclerView.Adapter<EducationAdapter.EducationViewHolder>(){

    class EducationViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val nama = itemView.findViewById<TextView>(R.id.namaeducation)
        private val alamat = itemView.findViewById<TextView>(R.id.alamateducation)

        fun bind(get: EducationData) {
            nama.text = get.nama
            alamat.text = get.alamat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationViewHolder {
        return EducationViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.education_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: EducationViewHolder, position: Int) {
        holder.bind(list[position])
    }
}