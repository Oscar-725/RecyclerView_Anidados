package com.example.recyclerviewanidados.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewanidados.R
import com.example.recyclerviewanidados.databinding.ItemBotonBinding
import com.example.recyclerviewanidados.databinding.ItemImagenBinding
import com.example.recyclerviewanidados.model.Boton

class BotonAdapter (private val Boton: List<Boton>) : RecyclerView.Adapter<BotonAdapter.BotonHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BotonHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BotonHolder(layoutInflater.inflate(R.layout.item_boton,parent,false))
    }

    override fun getItemCount(): Int = Boton.size

    override fun onBindViewHolder(holder: BotonHolder, position: Int) {
    holder.render(Boton[position])
    }


    class BotonHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemBotonBinding.bind(view)

        fun render(boton: Boton){
            binding.bButtom.text = "boton1"
        }


    }


}