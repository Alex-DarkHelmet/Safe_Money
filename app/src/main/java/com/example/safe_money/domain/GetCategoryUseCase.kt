package com.example.safe_money.domain

class GetCategoryUseCase(private val repository: CategoryListRepository) {

    fun getCategory(itemId: Int): CategoryItem {
        return repository.getCategory(itemId)
    }
}