package com.example.kotlinpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class adapterclass(private var datalist:ArrayList<Dataclass>):RecyclerView.Adapter<adapterclass.ViewHolderclass>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderclass {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)

        return ViewHolderclass(itemView)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: ViewHolderclass, position: Int) {
        val currentItem=datalist[position]
        holder.rvImag.setImageResource(currentItem.dataimg)
        holder.rvtitle.text=currentItem.datatitle

    }

    class ViewHolderclass(itemView: View): RecyclerView.ViewHolder(itemView){
        val rvImag:ImageView=itemView.findViewById(R.id.image)
        val rvtitle:TextView=itemView.findViewById(R.id.title)

    }
}