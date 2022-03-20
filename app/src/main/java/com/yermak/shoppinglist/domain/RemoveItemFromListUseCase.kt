package com.yermak.shoppinglist.domain

class RemoveItemFromListUseCase(private val shopListRepository: ShopListRepository) {
    fun removeItem(item: ShopItem){
        shopListRepository.removeItem(item)
    }
}