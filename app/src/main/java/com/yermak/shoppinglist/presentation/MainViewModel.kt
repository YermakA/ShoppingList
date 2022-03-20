package com.yermak.shoppinglist.presentation


import androidx.lifecycle.ViewModel
import com.yermak.shoppinglist.data.ShopListRepositoryImpl
import com.yermak.shoppinglist.domain.*

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val removeItemFromListUseCase = RemoveItemFromListUseCase(repository)
    private val editListItemUseCase = EditListItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(item: ShopItem) {
        removeItemFromListUseCase.removeItem(item)

    }

    fun changeEnableState(item: ShopItem) {
        val newItem = item.copy(enabled = !item.enabled)
        editListItemUseCase.editItem(newItem)

    }

}