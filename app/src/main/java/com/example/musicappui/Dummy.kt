package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)

val liblist = listOf<Lib>(
    Lib(R.drawable.ic_account, "Account"),
    Lib(R.drawable.ic_subscribe, "Subscription"),
    Lib(R.drawable.ic_library, "Library")
)
