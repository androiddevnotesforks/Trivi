package com.aboe.trivilauncher.presentation.nav

import kotlinx.serialization.Serializable

sealed class Path {
    @Serializable
    object AppsScreen : Path()
    @Serializable
    object GeminiScreen : Path()
    @Serializable
    object HomeScreen : Path()
}