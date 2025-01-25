package com.example.mysimplecleanarhcitecture.data

import com.example.mysimplecleanarhcitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}