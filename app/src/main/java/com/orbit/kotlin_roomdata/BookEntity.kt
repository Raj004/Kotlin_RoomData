package com.orbit.kotlin_roomdata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class BookEntity {

  @PrimaryKey
  var bookId: Int =0

  @ColumnInfo(name ="BookName")
  var bookName:  String =""

}
