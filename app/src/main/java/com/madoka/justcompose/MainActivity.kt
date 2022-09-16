package com.madoka.justcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.madoka.justcompose.ui.HomeScreen
import com.madoka.justcompose.ui.theme.JustComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustComposeTheme {
               HomeScreen()
            }
        }
    }
}