package com.example.instagramfragment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramfragment.databinding.ItemRvBinding
import com.example.instagramfragment.models.MyProfile

class MyProfileAdapter(private var myProfileList: ArrayList<MyProfile>) :
    RecyclerView.Adapter<MyProfileAdapter.Vh>() {

    inner class Vh(private var itemRvBinding: ItemRvBinding) :
        RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(myProfile: MyProfile) {
            itemRvBinding.img.setImageResource(myProfile.image)
            itemRvBinding.tv.text = myProfile.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return myProfileList.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(myProfileList[position])
    }
}