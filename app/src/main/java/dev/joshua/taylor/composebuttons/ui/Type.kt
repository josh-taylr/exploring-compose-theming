package dev.joshua.taylor.composebuttons.ui

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val appTypography = Typography(
        h1 = TextStyle(
                fontFamily = playfairDisplay,
                fontSize = 96.sp,
                lineHeight = 127.97.sp,
                letterSpacing = (-1.5).sp
        ),
        h2 = TextStyle(
                fontFamily = playfairDisplay,
                fontSize = 60.sp,
                lineHeight = 79.98.sp,
                letterSpacing = (-0.5).sp
        ),
        h3 = TextStyle(
                fontFamily = playfairDisplay,
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                lineHeight = 63.98.sp
        ),
        h4 = TextStyle(
                fontFamily = playfairDisplay,
                fontSize = 34.sp,
                lineHeight = 45.32.sp,
                letterSpacing = (0.25).sp
        ),
        body1 = TextStyle(
                fontFamily = openSans,
                fontSize = 18.sp,
                lineHeight = 28.sp,
                letterSpacing = 0.5.sp
        ),
        button = TextStyle(
                fontFamily = openSans,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.75.sp
        ),
        caption = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
        )
)