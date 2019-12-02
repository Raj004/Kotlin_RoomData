package com.orbit.kotlin_roomdata


import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * Created by ThinkSoft on 19/12/2017.
 */
@Dao
interface DaoContact {
    @Query("select * from contacts")
    fun getAllContacts(): LiveData<List<Contact>>

    @Query("select * from contacts where idContact in (:id)")
    fun getContactById(id: Int): Contact

    @Query("delete from contacts")
    fun deleteAllContacts()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact: Contact)

    @Update
    fun updateContact(contact: Contact)

    @Delete
    fun deleteContact(contact: Contact)
}