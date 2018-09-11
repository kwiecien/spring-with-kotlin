package com.example.blog

import java.time.LocalDateTime

data class Article(
        val title: String,
        val headline: String,
        val content: String,
        val author: User,
        val id: Long? = null,
        val addedAt: LocalDateTime = LocalDateTime.now())