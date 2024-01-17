package com.example.instagramfragment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramfragment.databinding.ItemImgBinding

class ImageAdapter(private var list: ArrayList<Int>) : RecyclerView.Adapter<ImageAdapter.Vh>() {

    inner class Vh(private val itemImgBinding: ItemImgBinding) :
        RecyclerView.ViewHolder(itemImgBinding.root) {
        fun onBind(img: Int) {
            itemImgBinding.img.setImageResource(img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemImgBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}