package ccom.orbit.kotlin_roomdata


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.orbit.kotlin_roomdata.Contact
import com.orbit.kotlin_roomdata.DaoContact

/**
 * Created by ThinkSoft on 19/12/2017.
 */
@Database(entities = [(Contact::class)], version = 2, exportSchema = false)
abstract class ContactDb : RoomDatabase() {
    companion object {
        private var INSTANCE: ContactDb? = null
        fun getDataBase(context: Context): ContactDb {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, ContactDb::class.java, "contacts-db")
                        .allowMainThreadQueries().build()
            }
            return INSTANCE as ContactDb
        }
    }
    abstract fun daoContact(): DaoContact
}