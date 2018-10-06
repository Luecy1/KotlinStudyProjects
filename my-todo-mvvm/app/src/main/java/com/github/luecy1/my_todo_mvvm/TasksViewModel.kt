package com.github.luecy1.my_todo_mvvm

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.content.Context
import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ObservableList
import android.graphics.drawable.Drawable
import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import android.support.v4.content.res.ResourcesCompat
import com.github.luecy1.my_todo_mvvm.data.Task

class TasksViewModel(
        context: Application,
        private val tasksRepository: TasksRepository
) : AndroidViewModel(context) {

    private val isDataLoadingError = ObservableBoolean(false)
    private val context: Context = context.applicationContext

    internal val openTaskEvent = SingleLiveEvent<String>()

    val items: ObservableList<Task> = ObservableArrayList()
    val dataLoading = ObservableBoolean(false)
    val currentFilteringLabel = ObservableField<String>()
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
        loadTasks(b, true)
    }

    private fun loadTasks(b: Boolean, b1: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun updateFiltering() {
        when (currentFiltering) {
            TasksFilterType.ALL_TASKS -> {
                setFilter(R.string.label_all,
                        R.string.no_tasks_all,
                        R.drawable.ic_assignment_turned_in_24dp, true)
            }
        }
    }

    private fun setFilter(
            @StringRes filteringLabelString: Int,
            @StringRes noTasksLabelString: Int,
            @DrawableRes noTaskIconDrawable: Int,
            tasksAddVisible: Boolean
    ) {
        with(context.resources) {
            currentFilteringLabel.set(context.getString(filteringLabelString))
            noTasksLabel.set(getString(noTasksLabelString))
            noTaskIconRes.set(ResourcesCompat.getDrawable(this,noTaskIconDrawable,null))
            tasksAddViewVisible.set(tasksAddVisible)
        }
    }

    fun clearCompletedTasks() {
        tasksRepository.clearCompletedTasks()
        snaclbarMessage.value = R.string.completed_tasks_cleared
        loadTasks(false,false)
    }
}