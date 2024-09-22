package com.example.apptenis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.apptenis.data.AppContainer
import com.example.apptenis.ui.navigation.TenisNavGraph
import com.example.apptenis.ui.theme.AppTenisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTenisTheme{

                val appContainer = AppContainer(applicationContext)
                val tenisRepository = appContainer.tenisRepository
                val navController = rememberNavController()
                TenisNavGraph(navController = navController, tenisRepository = tenisRepository)
            }
        }
    }
}
