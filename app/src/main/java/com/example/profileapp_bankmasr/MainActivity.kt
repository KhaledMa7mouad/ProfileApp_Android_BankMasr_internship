package com.example.profileapp_bankmasr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileapp_bankmasr.ui.theme.ProfileApp_bankmasrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileApp_bankmasrTheme {
                 ProfileDesign(stringResource(R.string.name),
                     stringResource(R.string.job), "khaled.iredell@examplepetstore.com", "+201012345678")

            }
        }
    }
}

@Composable
fun ProfileDesign(name: String, job: String, email: String, phone: String ,  modifier: Modifier = Modifier) {

    Column(
   verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.profile_bg),
                contentScale = ContentScale.Crop,
                alpha = 0.4f
            )

    ) {

        Image(painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier= modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(
                    BorderStroke(4.dp, Color.Black),
                    CircleShape
                )
        )

        Text(
            text = name,
            fontSize = 40.sp
        )
        Text(
            text = job,
            fontSize = 32.sp
        )
        Row (Modifier.padding(32.dp)){
            Text(
                text = email ,
                Modifier.padding(end = 16.dp),
                textDecoration = TextDecoration.Underline,
            )
            Text(
                text = phone ,
                textDecoration = TextDecoration.Underline,
            )

        }

    }

}



@Preview(showSystemUi = true)
@Composable
fun ProfileDesignPreview() {
    ProfileDesign("Khaled Mahmoud", "Android Developer", "khaled.iredell@examplepetstore.com", "01012345678")
}

