package com.loc.newsapp.domain.usecases.news

data class NewsUsesCases(
    val getNews: GetNews,
    val searchNews: SearchNews,
    val upsertArticle: UpsertArticle,
    val deleteArticle: DeleteArticle,
    val selectArticles: SelectArticles
)
