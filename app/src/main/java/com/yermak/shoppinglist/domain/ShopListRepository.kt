package com.yermak.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun getShopList(): LiveData<List<ShopItem>>
    fun addItem(item: ShopItem)
    fun editItem(item: ShopItem)
    fun removeItem(item: ShopItem)
    fun getItem(itemId: Int): ShopItem
}