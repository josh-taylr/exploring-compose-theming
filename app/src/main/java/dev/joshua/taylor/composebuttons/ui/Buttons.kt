package dev.joshua.taylor.composebuttons.ui

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(name = "Contained button", showBackground = true)
@Composable
fun ContainedButtonPreview() {
    AppTheme {
        Button(onClick = {}) {
            Text(text = "Contained button")
        }
    }
}

@Preview(name = "Text button", showBackground = true)
@Composable
fun OutlinedButtonPreview() {
    AppTheme {
        TextButton(onClick = {}) {
            Text(text = "Outline button")
        }
    }
}

@Preview(name = "Outline button", showBackground = true)
@Composable
fun TextButtonPreview() {
    AppTheme {
        OutlinedButton(onClick = {}) {
            Text(text = "Text button")
        }
    }
}