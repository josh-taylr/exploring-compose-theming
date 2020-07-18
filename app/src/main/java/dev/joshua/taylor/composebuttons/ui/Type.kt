package dev.joshua.taylor.composebuttons.ui

import androidx.ui.material.Typography
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.TextUnit
import androidx.ui.unit.sp

val appTypography = Typography(
        h1 = TextStyle(
                fontFamily = playfairDisplay,
                fontSize = TextUnit.Sp(96),
                lineHeight = TextUnit.Sp(127.97),
                letterSpacing = TextUnit.Sp(-1.5)
        ),
        h2 = TextStyle(
                fontFamily = playfairDisplay,
                fontSize = TextUnit.Sp(60),
                lineHeight = TextUnit.Sp(79.98),
                letterSpacing = TextUnit.Sp(-0.5)
        ),
        h3 = TextStyle(
                fontFamily = playfairDisplay,
                fontWeight = FontWeight.Bold,
                fontSize = TextUnit.Sp(48),
                lineHeight = TextUnit.Sp(63.98)
        ),
        h4 = TextStyle(
                fontFamily = playfairDisplay,
                fontSize = TextUnit.Sp(34),
                lineHeight = TextUnit.Sp(45.32),
                letterSpacing = TextUnit.Sp(0.25)
        ),
        body1 = TextStyle(
                fontFamily = openSans,
                fontSize = TextUnit.Sp(18),
                lineHeight = TextUnit.Sp(28),
                letterSpacing = TextUnit.Sp(0.5)
        ),
        button = TextStyle(
                fontFamily = openSans,
                fontWeight = FontWeight.SemiBold,
                fontSize = TextUnit.Sp(14),
                lineHeight = TextUnit.Sp(16),
                letterSpacing = 0.75.sp
        ),
        caption = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
        )
)