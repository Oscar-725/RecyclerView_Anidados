package com.example.recyclerviewanidados.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewanidados.model.Imagen
import com.example.recyclerviewanidados.R
import com.example.recyclerviewanidados.databinding.ItemImagenBinding
import com.squareup.picasso.Picasso

class ImagenAdapter(private val Imagenes: List<Imagen>) : RecyclerView.Adapter<ImagenAdapter.ImagenHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagenHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ImagenHolder(layoutInflater.inflate(R.layout.item_imagen,parent,false))
    }

    override fun getItemCount(): Int = Imagenes.size

    override fun onBindViewHolder(holder: ImagenHolder, position: Int) {

        holder.render(Imagenes[position])
    }

    class ImagenHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemImagenBinding.bind(view)

        fun render(imagen: Imagen){
            Picasso.get().load(imagen.imagen).into(binding.ivImagen)
            view.setOnClickListener{Toast.makeText(view.context,"Has seleccionado la imagen",Toast.LENGTH_SHORT).show()}
        }



    }


}