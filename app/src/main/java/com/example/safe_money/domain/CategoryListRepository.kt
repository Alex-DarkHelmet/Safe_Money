package com.example.safe_money.domain

interface CategoryListRepository {

    fun addNewCategory(item: CategoryItem)

    fun deleteCategory(item: CategoryItem)

    fun editCategory(item: CategoryItem)

    fun getCategory(itemId: Int): CategoryItem

    fun getCategoryList(): List<CategoryItem>

}