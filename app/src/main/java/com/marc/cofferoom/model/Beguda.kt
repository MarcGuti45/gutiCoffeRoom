package com.marc.cofferoom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Drink")
data class Beguda(

    @ColumnInfo(name = "name")
    var nom: String,

    @ColumnInfo(name = "price")
    var preu: Int
){
    @PrimaryKey(autoGenerate = true)
    var Id: Int? = null
}
