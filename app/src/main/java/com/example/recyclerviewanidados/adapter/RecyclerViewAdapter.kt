package com.example.recyclerviewanidados.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewanidados.Bindable
import com.example.recyclerviewanidados.R
import com.example.recyclerviewanidados.databinding.RecyclerviewGeneralBinding
import com.example.recyclerviewanidados.model.Boton
import com.example.recyclerviewanidados.model.Imagen
import com.example.recyclerviewanidados.model.Texto

class RecyclerViewAdapter (val Items: List<List<Bindable>>) : RecyclerView.Adapter<RecyclerViewAdapter.ItemsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemsHolder(layoutInflater.inflate(R.layout.recyclerview_general,parent,false))
    }

    override fun getItemCount(): Int = Items.size

    override fun onBindViewHolder(holder: ItemsHolder, position: Int) {
        holder.render(Items[position])
    }

    class ItemsHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val binding = RecyclerviewGeneralBinding.bind(view)

        fun render(list: List<Bindable>) {

            val tipoActual = list[0]

            when(tipoActual) {
                is Boton -> { val listB = list.map { it as Boton }
                    binding.rvRecycler.layoutManager = LinearLayoutManager (binding.root.context)
                    val adapterBoton = BotonAdapter(listB)
                    binding.rvRecycler.adapter = adapterBoton
                }
                is Imagen -> {val listaI = list.map { it as Imagen }
                    binding.rvRecycler.layoutManager = LinearLayoutManager(binding.root.context)
                    val adapterImagen = ImagenAdapter(listaI)
                    binding.rvRecycler.adapter = adapterImagen
                }
                is Texto -> { val listaT = list.map { it as Texto }
                    binding.rvRecycler.layoutManager = LinearLayoutManager(binding.root.context)
                    val adapterTexto = TextoAdapter(listaT)
                    binding.rvRecycler.adapter = adapterTexto

                }
            }

        }

    }

}