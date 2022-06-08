package com.example.safe_money.domain

class DeleteCategoryUseCase(private val repository: CategoryListRepository) {
    fun deleteCategory(item: CategoryItem) {
        repository.deleteCategory(item)
    }
}