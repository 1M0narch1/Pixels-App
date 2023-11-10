package dev.bitcup.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import dev.bitcup.data.database.dao.ImageDao
import dev.bitcup.data.models.ImageModel
import java.util.UUID

@Database(
    entities = [ImageModel::class],
    version = AppDatabase.DATABASE_VERSION
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getImageDao() : ImageDao

    companion object{
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "PixelsAppDatabase"

        private var INSTANCE : AppDatabase? = null

        fun getDatabase(context : Context) : AppDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    AppDatabase.DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }

}