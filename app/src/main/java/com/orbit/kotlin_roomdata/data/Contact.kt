package com.orbit.kotlin_roomdata


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contacts")
data class Contact(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "idContact")
        var id: Int = 0,

        @ColumnInfo(name = "name")
        var name: String = "",

        @ColumnInfo(name = "number")
        var number: String = ""

)