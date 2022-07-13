package edu.pe.idat.perufestapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    val repo = Repo()
    fun fetchUserData():LiveData<MutableList<Post>>{
        val mutableData =MutableLiveData<MutableList<Post>>()
        repo.getUserData().observeForever { userList->
            mutableData.value= userList

        }
        return mutableData
    }
    }