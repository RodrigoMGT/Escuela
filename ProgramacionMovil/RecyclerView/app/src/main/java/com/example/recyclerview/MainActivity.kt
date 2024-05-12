package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.LineNumberReader

class MainActivity : AppCompatActivity() {
    val juegos = listOf(
        Juego(Titulo="Elden Ring", Categoria = "Aventura, RPG de acción", Clasificacion = "+18", Calificacion = 4.5f,Imagen= R.drawable.er),
        Juego(Titulo="God of War (2018)", Categoria = "Aventura, Acción",Clasificacion = "+18", Calificacion = 5f,Imagen= R.drawable.gw),
        Juego(Titulo="Red Dead Redemption 2", Categoria = "Aventura, Acción", Clasificacion = "+18",Calificacion = 5f,Imagen= R.drawable.rdr),
        Juego(Titulo="The Witcher 3: Wild Hunt", Categoria = "Aventura, RPG de acción",Clasificacion = "+18", Calificacion = 4f,Imagen= R.drawable.tw3),
        Juego(Titulo="Grand Theft Auto V", Categoria = "Aventura, Acción", Clasificacion = "+18",Calificacion = 5f,Imagen= R.drawable.gta),
        Juego(Titulo="Super Mario Odyssey", Categoria = "Aventura, RPG de acción",Clasificacion = "Todos", Calificacion = 4.5f,Imagen= R.drawable.smo),
        Juego(Titulo="The Legend of Zelda: Breath of the Wild", Categoria = "Aventura, Acción",Clasificacion = "Todos", Calificacion = 4.5f,Imagen= R.drawable.tlz),
        Juego(Titulo="Celeste", Categoria = "Plataformas, Indie",Clasificacion = "Todos", Calificacion = 4.5f,Imagen= R.drawable.celeste),
        Juego(Titulo="Stardew Valley", Categoria = "Simulación, RPG",Clasificacion = "Todos", Calificacion = 3.5f,Imagen= R.drawable.sv),
        Juego(Titulo="Hades", Categoria = "Roguelike, Acción",Clasificacion = "+16", Calificacion = 4f,Imagen= R.drawable.hades),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val rv=findViewById<RecyclerView>(R.id.rv_juegos)
        rv.adapter = VideoJuegoAdapter(juegos)
        rv.layoutManager=LinearLayoutManager(this)
    }
}