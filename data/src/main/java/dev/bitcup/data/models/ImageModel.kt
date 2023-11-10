package dev.bitcup.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "image_table")
data class ImageModel (
    val photograferName : String,
    val filePath : String,
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0
)
