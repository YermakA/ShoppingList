package com.yermak.shoppinglist.data

import com.yermak.shoppinglist.domain.ShopItem
import com.yermak.shoppinglist.domain.ShopListRepository

object ShopListRepositoryImpl: ShopListRepository {
    override fun getShopList(): List<ShopItem> {
        TODO("Not yet implemented")
    }

    override fun addItem(item: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun editItem(item: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun removeItem(item: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun getItem(itemId: Int): ShopItem {
        TODO("Not yet implemented")
    }
}