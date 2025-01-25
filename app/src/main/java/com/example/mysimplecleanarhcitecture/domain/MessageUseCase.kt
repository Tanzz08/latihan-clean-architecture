package com.example.mysimplecleanarhcitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}