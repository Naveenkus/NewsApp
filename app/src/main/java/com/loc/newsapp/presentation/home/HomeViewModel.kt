package com.loc.newsapp.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.loc.newsapp.domain.usecases.news.NewsUsesCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel@Inject constructor(
    private val newsUsesCases: NewsUsesCases
):ViewModel() {

    val news = newsUsesCases.getNews(
        sources = listOf("abc-news", "bbc-news", "al-jazeera-news")
    ).cachedIn(viewModelScope)
}