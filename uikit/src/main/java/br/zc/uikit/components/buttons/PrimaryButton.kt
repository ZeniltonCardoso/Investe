package br.zc.uikit.components.buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean,
    onClick: () -> Unit,
    shape: RoundedCornerShape = RoundedCornerShape(8.dp),
    colorsText: Color = Color(0xFF1A73E8),
    colorsButton: Color = Color(0xFF1A73E8)
) {
    Button(
        enabled = enabled,
        shape = shape,
        onClick = onClick,
        modifier = modifier
            .heightIn(min = 48.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorsButton,
        )
    ) {
        Text(
            text = text,
            color = colorsText
        )
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    Column {
        PrimaryButton(
            text = "Preview",
            enabled = true,
            onClick = { },
            colorsButton = Color(0xFFE8F0FE),
            colorsText = Color.Black
        )
        Spacer(modifier = Modifier.height(16.dp))
        PrimaryButton(
            text = "Preview",
            enabled = true,
            onClick = { },
            colorsButton = Color(0xFF1A73E8),
            colorsText = Color.White
        )
    }
}