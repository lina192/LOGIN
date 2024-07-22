package co.edu.sena.login.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.login.R
import co.edu.sena.login.components.NormalTextComponent
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.edu.sena.login.components.HeadingTextComponent


@Composable
fun SignUpScreen () {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(modifier = Modifier.fillMaxSize() ) {



        NormalTextComponent(value = stringResource(id = R.string.hello ) )
        HeadingTextComponent(value = stringResource(id = R.string.create_account) )

        }
    }
}

@Preview
@Composable
fun DefaultPreviewOf(){
    SignUpScreen()

}

