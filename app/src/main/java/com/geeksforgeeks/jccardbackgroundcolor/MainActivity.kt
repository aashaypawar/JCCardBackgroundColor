package com.geeksforgeeks.jccardbackgroundcolor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.geeksforgeeks.jccardbackgroundcolor.ui.theme.JCCardBackgroundColorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent(){
    Scaffold(
        topBar = {TopAppBar(
            title = {Text(
                "GFG | Card background Color",
                color = Color.White)},
            backgroundColor = Color(0xff0f9d58)
        ) },
        content = { MyContent()}
    )
}

@Composable
fun MyContent() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Card(
            backgroundColor = Color.Red
        ) {
            Column(Modifier.padding(10.dp)) {
                Text("GeeksforGeeks", fontWeight = FontWeight.W700)
                Text("+91 1800 2584458")
                Text("Noida, India", color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.height(100.dp))

        Card(
            backgroundColor = Color(0XFF0F9D58)
        ) {
            Column(Modifier.padding(10.dp)) {
                Text("GeeksforGeeks", fontWeight = FontWeight.W700)
                Text("+91 1800 2584458")
                Text("Noida, India", color = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainContent()
}