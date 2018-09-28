package com.github.luecy1.my_todo_mvvm.data

import java.util.*


data class Task @JvmOverloads constructor(
        var title: String = "",
        var description: String = "",
        var id : String = UUID.randomUUID().toString()
        ) {
}