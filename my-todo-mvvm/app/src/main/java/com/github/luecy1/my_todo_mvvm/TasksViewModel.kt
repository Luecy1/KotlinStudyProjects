package com.github.luecy1.my_todo_mvvm

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.content.Context

class TasksViewModel(
        context: Application
) : AndroidViewModel(context) {

    private val context: Context = context.applicationContext

}