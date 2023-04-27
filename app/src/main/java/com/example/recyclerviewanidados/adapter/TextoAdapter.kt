package com.example.recyclerviewanidados.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewanidados.R
import com.example.recyclerviewanidados.databinding.ItemTextoBinding
import com.example.recyclerviewanidados.model.Texto

class TextoAdapter (val Textos: List<Texto>) : RecyclerView.Adapter<TextoAdapter.TextoHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextoHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TextoHolder(layoutInflater.inflate(R.layout.item_texto,parent,false))
    }

    override fun getItemCount(): Int = Textos.size


    override fun onBindViewHolder(holder: TextoHolder, position: Int) {
        holder.render(Textos[position])

    }

    class TextoHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemTextoBinding.bind(view)

        fun render(texto: Texto){
            binding.tvTexto.text = texto.texto

        }

    }

}