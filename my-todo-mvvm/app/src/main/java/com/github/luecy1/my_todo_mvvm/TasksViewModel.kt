package com.github.luecy1.my_todo_mvvm

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.content.Context
import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ObservableList
import android.graphics.drawable.AdaptiveIconDrawable
import android.graphics.drawable.Drawable
import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import com.github.luecy1.my_todo_mvvm.data.Task

class TasksViewModel(
        context: Application
) : AndroidViewModel(context) {

    private val isDataLoadingError = ObservableBoolean(false)
    private val context: Context = context.applicationContext

    internal val openTaskEvent = SingleLiveEvent<String>()

    val items:ObservableList<Task> = ObservableArrayList()
    val dataLoading = ObservableBoolean(false)
    val vurrentFilteringLabel = ObservableField<String>()
    val noTaskIconRes = ObservableField<Drawable>()
    val noTasksLabel = ObservableField<String>()
    val empty = ObservableBoolean(false)
    val tasksAddViewVisible = ObservableBoolean()
    val snaclbarMessage = SingleLiveEvent<Int>()
    val newTaskEvent = SingleLiveEvent<Void>()

    var currentFiltering = TasksFilterType.ALL_TASKS
    set(value) {
        field = value
        updateFiltering()
    }

    fun start(): Unit {
        loadTasks(false)
    }

    private fun loadTasks(b: Boolean) {
        loadTasks(b,true)
    }

    private fun loadTasks(b: Boolean, b1: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun updateFiltering() {
        when (currentFiltering) {
            TasksFilterType.ALL_TASKS -> {
                //TODO
            }
        }
    }

    private fun setFilter(
            @StringRes filteringLabelString:Int,
            @StringRes noTasksLabelString :Int,
            @DrawableRes noTaskIconDrawable: Int,
            tasksAddVisible : Boolean
    ) {
        // TODO
    }
}