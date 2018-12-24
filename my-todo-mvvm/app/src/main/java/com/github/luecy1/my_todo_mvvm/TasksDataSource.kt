package com.github.luecy1.my_todo_mvvm

import com.github.luecy1.my_todo_mvvm.data.Task

interface TasksDataSource {

    interface LoadTaskCallback {
        fun onTasksLoaded(tasks: List<Task>)

        fun onDataNotAvailable()
    }

    interface GetTaskCallback {

        fun onTaskLoaded(task: Task)

        fun onDataNotAvailable()
    }
}