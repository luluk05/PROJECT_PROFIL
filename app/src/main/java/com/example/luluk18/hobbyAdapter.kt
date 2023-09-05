package com.example.luluk18

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class hobbyAdapter (private var list: ArrayList<hobbyData>):
        RecyclerView.Adapter<hobbyAdapter.hobbyViewHolder>(){

    class hobbyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val nama = itemView.findViewById<TextView>(R.id.namahobby)
        private val desc = itemView.findViewById<TextView>(R.id.deschobby)

        fun bind(get: hobbyData) {
            nama.text = get.nama
            desc.text = get.desc
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): hobbyViewHolder {
        return hobbyViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.hobby_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: hobbyViewHolder, position: Int) {
        holder.bind(list[position])
    }
}