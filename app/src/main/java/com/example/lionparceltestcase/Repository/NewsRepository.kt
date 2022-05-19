package com.example.lionparceltestcase.Repository

import com.example.lionparceltestcase.api.RetrofitInstance
import com.example.lionparceltestcase.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int)=
        RetrofitInstance.api.searchNews(searchQuery, pageNumber)
}