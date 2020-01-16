package com.example.project4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project4.R
import com.example.project4.model.Shoes

class ShoesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var codeno = itemView.findViewById<TextView>(R.id.txt_codeno)
    var image = itemView.findViewById<ImageView>(R.id.img_image)
    var name = itemView.findViewById<TextView>(R.id.txt_name)
    var type = itemView.findViewById<TextView>(R.id.txt_type)
    var price = itemView.findViewById<TextView>(R.id.txt_price)
}

class ShoesAdapter(var shoesList:ArrayList<Shoes>):RecyclerView.Adapter<ShoesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoesViewHolder {
        var view =LayoutInflater.from(parent.context).inflate(R.layout.inner_layout,parent,false)
        return ShoesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoesList.size
    }

    override fun onBindViewHolder(holder: ShoesViewHolder, position: Int) {
        holder.codeno.text = shoesList[position].codeno
        holder.image.setImageResource(shoesList[position].image)
        holder.name.text = shoesList[position].name
        holder.type.text = shoesList[position].type
        holder.price.text = "Prices - $" + shoesList[position].price
    }

}