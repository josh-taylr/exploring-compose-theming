package dev.joshua.taylor.composebuttons.ui

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.foundation.currentTextStyle
import androidx.ui.layout.Column
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontListFontFamily
import androidx.ui.text.font.FontWeight
import androidx.ui.text.font.ResourceFont
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.TextUnit
import dev.joshua.taylor.composebuttons.R

private const val PreviewFontScale = 0.25f

@Preview(showBackground = true, fontScale = PreviewFontScale)
@Composable
fun TextPreview() {
    AppTheme {
        Column {
            Text(text = "H1 / Playfair Display Bold", style = appTypography.h1)
            Text(text = "H2 / Playfair Display Regular", style = appTypography.h2)
            Text(text = "H3 / Playfair Display Bold", style = appTypography.h3)
            Text(text = "H4 / Playfair Display Regular", style = appTypography.h4)
            Text(text = "Body / Open Sans Regular", style = appTypography.body1)
            Text(text = "Button / Open Sans Semibold", style = appTypography.button)
        }
    }
}
