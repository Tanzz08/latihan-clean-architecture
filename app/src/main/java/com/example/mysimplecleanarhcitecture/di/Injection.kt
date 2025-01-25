package com.example.mysimplecleanarhcitecture.di

import com.example.mysimplecleanarhcitecture.data.IMessageDataSource
import com.example.mysimplecleanarhcitecture.data.MessageDataSource
import com.example.mysimplecleanarhcitecture.data.MessageRepository
import com.example.mysimplecleanarhcitecture.domain.IMessageRepository
import com.example.mysimplecleanarhcitecture.domain.MessageInteractor
import com.example.mysimplecleanarhcitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}