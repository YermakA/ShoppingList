package com.yermak.shoppinglist.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yermak.shoppinglist.R
import com.yermak.shoppinglist.domain.ShopItem

class ShopListAdapter: RecyclerView.Adapter<ShopListAdapter.ShopItemViewHolder>() {

    val list = listOf<ShopItem>()

    class ShopItemViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val tvName = view.findViewById<TextView>(R.id.tv_name)
        val tvCount = view.findViewById<TextView>(R.id.tv_count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolder {
        return ShopItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_shop_disabled, parent, false))
    }

    override fun onBindViewHolder(holder: ShopItemViewHolder, position: Int) {
        val shopItem = list[position]
        holder.tvCount.text = shopItem.count.toString()
        holder.tvName.text = shopItem.name
    }

    override fun getItemCount(): Int {
        return list.size
    }
}