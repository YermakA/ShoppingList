package com.yermak.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yermak.shoppinglist.data.ShopListRepositoryImpl
import com.yermak.shoppinglist.domain.*

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val removeItemFromListUseCase = RemoveItemFromListUseCase(repository)
    private val editListItemUseCase = EditListItemUseCase(repository)

    val shopList = MutableLiveData<List<ShopItem>>()
    fun getShopList() {
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }

    fun deleteShopItem(item: ShopItem){
        removeItemFromListUseCase.removeItem(item)
        getShopList()
    }

    fun changeEnableState(item: ShopItem){
        val newItem = item.copy(enabled = !item.enabled)
        editListItemUseCase.editItem(newItem)
        getShopList()
    }

}