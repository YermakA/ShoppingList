package com.yermak.shoppinglist.domain

class AddItemToListUseCase(private val shopListRepository: ShopListRepository) {
    fun addItem(item: ShopItem) {
        shopListRepository.addItem(item)
    }
}