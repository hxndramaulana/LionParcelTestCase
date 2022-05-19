package com.example.lionparceltestcase.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lionparceltestcase.Repository.NewsRepository

class NewsViewModelProviderFactory(
    val newsRepository: NewsRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}