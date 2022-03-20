package com.yermak.shoppinglist.domain

interface ShopListRepository {
    fun getShopList(): List<ShopItem>
    fun addItem(item: ShopItem)
    fun editItem(item: ShopItem)
    fun removeItem(item: ShopItem)
    fun getItem(itemId: Int): ShopItem
}