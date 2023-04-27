package com.example.recyclerviewanidados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewanidados.adapter.RecyclerViewAdapter
import com.example.recyclerviewanidados.databinding.ActivityMainBinding
import com.example.recyclerviewanidados.model.Boton
import com.example.recyclerviewanidados.model.Imagen
import com.example.recyclerviewanidados.model.Texto

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var imagenes: List<Imagen> = listOf(
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        Imagen("https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg")
    )
    var textos: List<Texto> = listOf(
        Texto("que tal"),
        Texto("como estas"),
        Texto("las rolas"),
        Texto("caifanes"),
        Texto("como te va")
    )
    var botones: List<Boton> = listOf(
        Boton("1"),
        Boton("2"),
        Boton("3"),
        Boton("4"),
        Boton("5"),
        Boton("1"),
        Boton("2"),
        Boton("3"),
        Boton("4"),
        Boton("5")
    )
    var items: MutableList<List<Bindable>> = mutableListOf(
        imagenes,
        textos,
        botones
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()
    }
    private fun initRecycler() {
        binding.rvMain.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerViewAdapter(items)
        binding.rvMain.adapter = adapter
    }

}