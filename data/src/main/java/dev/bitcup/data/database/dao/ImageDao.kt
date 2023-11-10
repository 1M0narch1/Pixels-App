package dev.bitcup.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.bitcup.data.models.ImageModel

@Dao
interface ImageDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(image: ImageModel)

    @Query("SELECT * FROM image_table")
    fun getAllImage() : List<ImageModel>

    @Query("DELETE FROM image_table")
    fun deleteAllImage()

    @Query("DELETE FROM image_table WHERE filePath = :path")
    fun deleteImage(path : String)
}