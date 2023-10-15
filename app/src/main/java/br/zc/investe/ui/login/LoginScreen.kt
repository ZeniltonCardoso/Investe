package br.zc.investe.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.zc.investe.R
import br.zc.uikit.components.buttons.GhostButton
import br.zc.uikit.components.buttons.PrimaryButton

@Composable
fun LoginScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
            .padding(24.dp)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f),
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = null
        )
        PrimaryButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            text = "Faça login com e-mail",
            enabled = true,
            onClick = {

            },
            shape = RoundedCornerShape(24.dp),
            colorsButton = Color(0xFF1E90FF)
        )
        GhostButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            text = "Google",
            enabled = true,
            onClick = {

            }
        )
    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}