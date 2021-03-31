package dev.joshua.taylor.composebuttons.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BookmarkAdd
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.*

val shapes = Shapes(
    small = AbsoluteRoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

@Preview(showSystemUi = false, backgroundColor = 0xFFFFFFFF)
@Composable
fun ShapePreview() {
    AppTheme {
        Column {
            FloatingActionButton(
                onClick = { },
                modifier = Modifier.padding(8.dp),
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(
                    imageVector = Icons.Outlined.BookmarkAdd,
                    contentDescription = ""
                )
            }
            Button(
                onClick = { },
                Modifier.padding(8.dp)
            ) {
                Text(text = "Button".toUpperCase(Locale.UK))
            }
        }
    }
}