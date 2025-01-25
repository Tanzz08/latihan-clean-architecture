package com.example.mysimplecleanarhcitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}