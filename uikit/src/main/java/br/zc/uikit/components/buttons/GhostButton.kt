package br.zc.uikit.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GhostButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true,
    contentPadding: PaddingValues = ButtonDefaults.TextButtonContentPadding,
    textStyle: TextStyle = typography.bodyMedium,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier.heightIn(min = 48.dp),
        contentPadding = contentPadding,
        enabled = enabled,
        border = BorderStroke(1.dp, Color.DarkGray)
    ) {
        Text(
            text = text,
            style = textStyle.copy(
                textAlign = TextAlign.Center,
                color = Color.White
            ),
            modifier = Modifier.padding(4.dp)
        )
    }
}

@Preview
@Composable
fun TextButtonPreview() {
    Column {
        GhostButton(
            text = "Preview",
            onClick = { }
        )
        Spacer(modifier = Modifier.height(16.dp))
        GhostButton(
            text = "Preview",
            onClick = { }
        )
        Spacer(modifier = Modifier.height(16.dp))
        GhostButton(
            text = "Preview",
            onClick = { },
        )
        Spacer(modifier = Modifier.height(16.dp))
        GhostButton(
            text = "Preview",
            onClick = { },
            enabled = false
        )
    }
}