package com.example.blog

data class User(
        val login: String,
        val firstname: String,
        val lastname: String,
        val description: String? = null)