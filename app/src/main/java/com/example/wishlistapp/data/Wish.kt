package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android watch"),
        Wish(title = "Oculus Quest 2", description = "A VR headset for playing games"),
        Wish(title = "A Sci-fi Book", description = "A Science fiction book from any best seller"),
        Wish(title = "Bean Bag", description = "A comfy bean bag to substitute for a chair")
    )
}