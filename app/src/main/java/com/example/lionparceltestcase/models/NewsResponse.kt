package com.example.lionparceltestcase.models

import com.example.lionparceltestcase.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)