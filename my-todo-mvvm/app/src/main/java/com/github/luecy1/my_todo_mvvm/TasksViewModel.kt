package com.github.luecy1.my_todo_mvvm

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.content.Context
import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableList
import com.github.luecy1.my_todo_mvvm.data.Task

class TasksViewModel(
        context: Application
) : AndroidViewModel(context) {

    private val isDataLoadingError = ObservableBoolean(false)
    private val context: Context = context.applicationContext

    internal val openTaskEvent = SingleLiveEvent<String>()

    val items:ObservableList<Task> = ObservableArrayList()
}