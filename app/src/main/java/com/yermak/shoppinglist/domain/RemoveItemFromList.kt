package com.yermak.shoppinglist.domain

class RemoveItemFromList(private val shopListRepository: ShopListRepository) {
    fun removeItem(item: ShopItem){
        shopListRepository.removeItem(item)
    }
}