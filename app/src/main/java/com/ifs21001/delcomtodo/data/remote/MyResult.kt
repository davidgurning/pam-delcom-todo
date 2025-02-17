package com.ifs21001.delcomtodo.data.remote

sealed class MyResult<out R> private constructor() {
    data class Success<out T>(val data: T) : MyResult<T>()
    data class Error(val error: String) : MyResult<Nothing>()
    data object Loading : MyResult<Nothing>()
}