package com.example.mysimplecleanarhcitecture.data

import com.example.mysimplecleanarhcitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}