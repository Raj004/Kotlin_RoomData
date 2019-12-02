package com.orbit.kotlin_roomdata

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [(BookEntity::class)],version = 4)
abstract class AppDb : RoomDatabase() {

  abstract fun bookDao(): BookDAO
}
