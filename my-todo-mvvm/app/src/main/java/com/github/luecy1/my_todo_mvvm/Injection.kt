package com.github.luecy1.my_todo_mvvm

import android.content.Context

object Injection {

    fun provideTasksRepository(context: Context): TasksRepository {
        val database = ToDoDatabase.getInstance(context)
        return TasksRepository.getInstance(FakeTasksRemoteDataSource,
                TasksLocalDataSource.getInstance(AppExecutors(), database.taskDao()))
    }
}
