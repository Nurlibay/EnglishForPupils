package uz.nurlibaydev.englishforpupils.utils

import androidx.lifecycle.MutableLiveData

object Observer {
    var emptyDataObserver: MutableLiveData<Boolean> = MutableLiveData()
    var whichTask: MutableLiveData<Int> = MutableLiveData()
}