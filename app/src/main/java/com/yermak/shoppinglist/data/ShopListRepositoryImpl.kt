package com.yermak.shoppinglist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.yermak.shoppinglist.domain.ShopItem
import com.yermak.shoppinglist.domain.ShopListRepository
import java.lang.RuntimeException

object ShopListRepositoryImpl : ShopListRepository {
    private val shopListLD = MutableLiveData<List<ShopItem>>()
    private val shopList = mutableListOf<ShopItem>()



    private var autoIncrementId = 0

    init {
        for (i in 0 until 10) {
            addItem(ShopItem(i, "number $i", i, true))
        }
    }

    override fun addItem(item: ShopItem) {
        if (item.id == ShopItem.UNDEFINED_ID) {
            item.id = autoIncrementId++
        }
        shopList.add(item)
        updateList()
    }

    override fun editItem(item: ShopItem) {
        val oldItem = getItem(item.id)
        shopList.remove(oldItem)
        addItem(item)
    }

    override fun removeItem(item: ShopItem) {
        shopList.remove(item)
        updateList()
    }

    override fun getItem(itemId: Int): ShopItem {
        return shopList.find { it.id == itemId }
            ?: throw RuntimeException("Element with id $itemId not found")
    }

    private fun updateList() {
        shopListLD.value = shopList.toList()
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        return shopListLD
    }
}