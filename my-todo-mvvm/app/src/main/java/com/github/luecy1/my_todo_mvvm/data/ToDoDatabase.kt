package com.github.luecy1.my_todo_mvvm.data

import android.content.Context

@Database(entities = arrayOf(Task::class), version = 1)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun taskDao(): TasksDao

    companion object {

        private var INSTANCE: ToDoDatabase? = null

        private val lock = Any()

        fun getInstance(context: Context): ToDoDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            ToDoDatabase::class.java, "Tasks.db")
                            .build()
                }
                return INSTANCE!!
            }
        }
    }

}