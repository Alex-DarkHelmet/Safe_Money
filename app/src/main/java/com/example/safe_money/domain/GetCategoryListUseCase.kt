package com.example.safe_money.domain

class GetCategoryListUseCase(private val repository: CategoryListRepository) {

    fun getCategoryList(): List<CategoryItem> {
        return repository.getCategoryList()
    }
}