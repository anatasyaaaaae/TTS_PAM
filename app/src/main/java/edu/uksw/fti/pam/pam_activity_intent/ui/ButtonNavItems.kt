package edu.uksw.fti.pam.pam_activity_intent.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ButtonNavItems (
    val title: String,
    val icon: ImageVector,
    val screen_route: String
    ) {
    object Home: ButtonNavItems("Home", Icons.Default.Home, "home")
    object Article: ButtonNavItems("Fitur", Icons.Default.Menu, "article")
    object Berita: ButtonNavItems("Berita", Icons.Default.Email, "berita")
    object Fitur: ButtonNavItems("Profil", Icons.Default.AccountCircle, "profil")
}