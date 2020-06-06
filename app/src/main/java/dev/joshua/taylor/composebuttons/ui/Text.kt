package dev.joshua.taylor.composebuttons.ui

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontListFontFamily
import androidx.ui.text.font.FontWeight
import androidx.ui.text.font.ResourceFont
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.TextUnit
import dev.joshua.taylor.composebuttons.R

val playfairDisplayRegular = ResourceFont(R.font.playfair_display)
val playfairDisplayBold = ResourceFont(R.font.playfair_display_bold, weight = FontWeight.Bold)

val playfairDisplay = FontListFontFamily(
        listOf(
                playfairDisplayRegular,
                playfairDisplayBold
        )
)

val openSans = FontListFontFamily(
        listOf(
                ResourceFont(R.font.open_sans),
                ResourceFont(R.font.open_sans_semibold, weight = FontWeight.SemiBold)
        )
)


val heading1Style = TextStyle.Default.copy(
        fontFamily = playfairDisplay,
        fontSize = TextUnit.Sp(96),
        lineHeight = TextUnit.Sp(127.97),
        letterSpacing = TextUnit.Sp(-1.5)
)

val heading2Style = TextStyle.Default.copy(
        fontFamily = playfairDisplay,
        fontSize = TextUnit.Sp(60),
        lineHeight = TextUnit.Sp(79.98),
        letterSpacing = TextUnit.Sp(-0.5)
)

val heading3Style = TextStyle.Default.copy(
        fontFamily = playfairDisplay,
        fontWeight = FontWeight.Bold,
        fontSize = TextUnit.Sp(48),
        lineHeight = TextUnit.Sp(63.98)
)

val heading4Style = TextStyle.Default.copy(
        fontFamily = playfairDisplay,
        fontSize = TextUnit.Sp(34),
        lineHeight = TextUnit.Sp(45.32),
        letterSpacing = TextUnit.Sp(0.25)
)

val bodyStyle = TextStyle.Default.copy(
        fontFamily = openSans,
        fontSize = TextUnit.Sp(18),
        lineHeight = TextUnit.Sp(28),
        letterSpacing = TextUnit.Sp(0.5)
)

val buttonStyle = TextStyle.Default.copy(
        fontFamily = openSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = TextUnit.Sp(14),
        lineHeight = TextUnit.Sp(16),
        letterSpacing = TextUnit.Sp(0.75)
)

private const val PreviewFontScale = 0.25f

@Preview(showBackground = true, fontScale = PreviewFontScale)
@Composable
fun TextPreview() {
    Column {
        Text(text = "H1 / Playfair Display Bold", style = heading1Style)
        Text(text = "H2 / Playfair Display Regular", style = heading2Style)
        Text(text = "H3 / Playfair Display Bold", style = heading3Style)
        Text(text = "H4 / Playfair Display Regular", style = heading4Style)
        Text(text = "Body / Open Sans Regular", style = bodyStyle)
        Text(text = "Button / Open Sans Semibold", style = buttonStyle)
    }
}
