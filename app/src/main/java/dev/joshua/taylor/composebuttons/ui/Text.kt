package dev.joshua.taylor.composebuttons.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*

val appTypography = Typography(
    h1 = TextStyle(
        fontFamily = AppFont.playfairDisplay,
        fontSize = 96.sp,
        lineHeight = 127.97.sp,
        letterSpacing = (-1.5).sp
    ),
    h2 = TextStyle(
        fontFamily = AppFont.playfairDisplay,
        fontSize = 60.sp,
        lineHeight = 79.98.sp,
        letterSpacing = (-0.5).sp
    ),
    h3 = TextStyle(
        fontFamily = AppFont.playfairDisplay,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Normal,
        fontSize = 48.sp,
        lineHeight = 63.98.sp
    ),
    h4 = TextStyle(
        fontFamily = AppFont.playfairDisplay,
        fontSize = 34.sp,
        lineHeight = 45.32.sp,
        letterSpacing = 0.25.sp
    ),
    h5 = TextStyle(
        fontFamily = AppFont.playfairDisplay,
        fontSize = 24.sp,
        lineHeight = 32.sp
    ),
    h6 = TextStyle(
        fontFamily = AppFont.playfairDisplay,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 26.66.sp,
        letterSpacing = (0.15).sp
    ),
    body1 = TextStyle(
        fontFamily = AppFont.openSans,
        fontSize = 18.sp,
        lineHeight = 28.sp
    ),
    body2 = TextStyle(
        fontFamily = AppFont.openSans,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = AppFont.openSans,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = AppFont.openSans,
        fontSize = 14.sp,
        lineHeight = 24.sp
    ),
    button = TextStyle(
        fontFamily = AppFont.roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.75.sp
    ),
    caption = TextStyle(
        fontFamily = AppFont.openSans,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    overline = TextStyle(
        fontFamily = AppFont.openSans,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.1.sp
    )
)

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFF,
    widthDp = 900
)
@Composable
fun TextPreview() {
    AppTheme {
        Column(Modifier.padding(24.dp)) {
            Text(text = "H1 / Playfair Display", style = appTypography.h1)
            Text(text = "H2 / Playfair Display", style = appTypography.h2)
            Text(text = "H3 / Playfair Display", style = appTypography.h3)
            Text(text = "H4 / Playfair Display", style = appTypography.h4)
            Text(text = "H5 / Playfair Display", style = appTypography.h5)
            Row {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "H6 / Playfair Display",
                    style = appTypography.h6
                )
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Subtitle / Roboto Medium",
                    style = appTypography.subtitle2
                )
            }
            Row {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Body 1 / Open Sans",
                    style = appTypography.body1
                )
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Button / Roboto Medium".toUpperCase(Locale.UK),
                    style = appTypography.button
                )
            }
            Row {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Body 2 / Open Sans",
                    style = appTypography.body2
                )
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Caption / Roboto Regular",
                    style = appTypography.caption
                )
            }
            Row {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Subtitle 1 / Roboto Regular",
                    style = appTypography.subtitle1
                )
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Overline / Open Sans".toUpperCase(Locale.UK),
                    style = appTypography.overline
                )
            }
        }
    }
}
