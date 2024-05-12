package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VideoJuegoAdapter(val datalist:List<Juego>)
    :RecyclerView.Adapter<VideoJuegoAdapter.ViewHolder>() {

        class ViewHolder(v: View): RecyclerView.ViewHolder(v){

            var titulo: TextView
            var categoria: TextView
            var clasificacion: TextView
            var calificacion: RatingBar
            var imagen: ImageView
            init {
                titulo = v.findViewById(R.id.tvTitulo)
                categoria = v.findViewById(R.id.tvCategoria)
                clasificacion = v.findViewById(R.id.tvClasificacion)
                calificacion = v.findViewById(R.id.rbCalificacion)
                imagen = v.findViewById(R.id.imgPortada)
            }
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoJuegoAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VideoJuegoAdapter.ViewHolder, position: Int) {
        val currentItem = datalist[position]
        holder.titulo.text = currentItem.Titulo
        holder.categoria.text = currentItem.Categoria
        holder.clasificacion.text = currentItem.Clasificacion
        holder.calificacion.rating = currentItem.Calificacion
        holder.imagen.setImageResource(currentItem.Imagen)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

}