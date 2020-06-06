package dev.joshua.taylor.composebuttons.ui

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Border
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.layout.InnerPadding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TextButton
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.Dp
import androidx.ui.unit.dp

@Composable
inline fun OutlineButton(
        noinline onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        elevation: Dp = 0.dp,
        shape: Shape = MaterialTheme.shapes.small,
        border: Border? = null,
        backgroundColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.colors.primary,
        disabledContentColor: Color = Button.defaultDisabledContentColor,
        padding: InnerPadding = TextButton.DefaultInnerPadding,
        noinline text: @Composable() () -> Unit
) = TextButton(
        modifier = modifier,
        onClick = onClick,
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = Border(1.dp, MaterialTheme.colors.primary),
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledContentColor = disabledContentColor,
        padding = padding,
        text = text
)

@Preview(name = "Contained button", showBackground = true)
@Composable
fun ContainedButtonPreview() {
    AppTheme {
        Button(onClick = {}) {
            Text(text = "Contained button", style = buttonStyle)
        }
    }
}

@Preview(name = "Text button", showBackground = true)
@Composable
fun OutlinedButtonPreview() {
    AppTheme {
        TextButton(onClick = {}) {
            Text(text = "Outline button", style = buttonStyle)
        }
    }
}

@Preview(name = "Outline button", showBackground = true)
@Composable
fun TextButtonPreview() {
    AppTheme {
        OutlineButton(onClick = {}) {
            Text(text = "Text button", style = buttonStyle)
        }
    }
}