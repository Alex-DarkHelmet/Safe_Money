package com.example.safe_money.domain

class AddNewCategoryUseCase(private val repository: CategoryListRepository) {
    fun addNewCategory(item: CategoryItem) {
        repository.addNewCategory(item)
    }
}