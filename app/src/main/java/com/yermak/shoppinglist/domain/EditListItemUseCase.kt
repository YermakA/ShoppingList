package com.yermak.shoppinglist.domain

class EditListItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editItem(item: ShopItem) {
    shopListRepository.editItem(item)
    }
}