package com.example.mysimplecleanarhcitecture.data

import com.example.mysimplecleanarhcitecture.domain.IMessageRepository
import com.example.mysimplecleanarhcitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}