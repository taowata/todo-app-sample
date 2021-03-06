package com.example.todo_app_sample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_table")
data class Todo(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name = "todo_name") var todoName: String
)