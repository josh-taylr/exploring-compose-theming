package dev.joshua.taylor.composebuttons.ui

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import dev.joshua.taylor.composebuttons.R

object AppFont {

    val playfairDisplay = FontFamily(
        Font(R.font.playfair_display),
        Font(R.font.playfair_display_bold, weight = FontWeight.Bold)
    )

    val openSans = FontFamily(
        Font(R.font.open_sans),
        Font(R.font.open_sans_semibold, weight = FontWeight.Medium),
        Font(R.font.open_sans_semibold, weight = FontWeight.SemiBold)
    )

    val roboto = FontFamily(
        Font(R.font.roboto_medium, weight = FontWeight.Medium)
    )
}