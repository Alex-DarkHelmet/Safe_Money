package com.example.safe_money.domain

class EditCategoryUseCase(private val repository: CategoryListRepository) {
    fun editCategory(item: CategoryItem) {
        repository.editCategory(item)
    }
}