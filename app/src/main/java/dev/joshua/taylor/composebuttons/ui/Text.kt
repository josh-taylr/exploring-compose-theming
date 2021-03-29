package dev.joshua.taylor.composebuttons.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

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
