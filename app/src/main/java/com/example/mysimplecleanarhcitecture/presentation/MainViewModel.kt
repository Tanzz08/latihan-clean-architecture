package com.example.mysimplecleanarhcitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mysimplecleanarhcitecture.domain.MessageEntity
import com.example.mysimplecleanarhcitecture.domain.MessageUseCase

class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String){
        _message.value = messageUseCase.getMessage(name)
    }
}