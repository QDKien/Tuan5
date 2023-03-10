package com.example.btt2screen

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel: ViewModel() {
    val currentUserData: LiveData<MutableMap<String, String>>
        get() = DataStore.currentUserData

    private val _userDataUpdateLabel: MutableLiveData<String> = MutableLiveData()
    val userDatUpdateLabel: LiveData<String>
        get() = _userDataUpdateLabel

    private var _isErrorEvent: MutableLiveData<String> = MutableLiveData()
    val isErrorEvent: LiveData<String>
        get() = _isErrorEvent

    private var _isSuccessEvent: MutableLiveData<String> = MutableLiveData()
    val isSuccessEvent: LiveData<String>
        get() = _isSuccessEvent

    fun dialogInputValid(dialogInput: Editable?, userDataKey: String, dialogDimiss: () -> Unit) {
        if(dialogInput?.isNotEmpty() == true)
        {
            val currentUserData = DataStore.currentUserData.value
            currentUserData?.set(userDataKey, dialogInput.toString())

            DataStore.currentUserData.value = currentUserData

            dialogDimiss()
            return _isSuccessEvent.postValue(userDataKey)
        }

        // Throw Error
        _isErrorEvent.postValue("Blank Input")
    }

}