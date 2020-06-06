package dev.joshua.taylor.composebuttons.ui

import androidx.compose.Composable
import androidx.ui.foundation.Border
import androidx.ui.foundation.Text
import androidx.ui.material.Button
import androidx.ui.material.TextButton
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp


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
        TextButton(
            onClick = {},
            border = Border(1.dp, red500)
        ) {
            Text(text = "Text button", style = buttonStyle)
        }
    }
}