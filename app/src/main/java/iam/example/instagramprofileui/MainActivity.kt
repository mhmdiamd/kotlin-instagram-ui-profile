package iam.example.instagramprofileui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import iam.example.instagramprofileui.screen.ProfileScreen
import iam.example.instagramprofileui.ui.theme.InstagramProfileUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramProfileUITheme {
                Scaffold {
                    Box(modifier = Modifier.padding(it).padding(top = 16.dp)) {
                        ProfileScreen()
                    }
                }
            }
        }
    }
}
