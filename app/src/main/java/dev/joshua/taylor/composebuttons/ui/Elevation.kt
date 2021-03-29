package dev.joshua.taylor.composebuttons.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
private fun Title(elevation: Dp) {
    Surface(
            elevation = elevation,
            color = light,
            modifier = Modifier.size(248.dp).padding(36.dp)
    ) {
        Text(text = "$elevation", modifier = Modifier.padding(8.dp))
    }
}

@Preview(
        name = "Elevation",
        showBackground = true,
        backgroundColor = 0xFFFFFFFF,
        widthDp = 1000
)
@Composable
fun ElevationPreview() {
    Column {
        Row {
            Title(elevation = 0.dp)
            Title(elevation = 1.dp)
            Title(elevation = 2.dp)
            Title(elevation = 3.dp)
        }
        Row {
            Title(elevation = 4.dp)
            Title(elevation = 6.dp)
            Title(elevation = 8.dp)
            Title(elevation = 9.dp)
        }
        Row {
            Title(elevation = 12.dp)
            Title(elevation = 16.dp)
            Title(elevation = 24.dp)
        }
    }
}
