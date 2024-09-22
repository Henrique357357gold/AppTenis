package com.example.apptenis.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.apptenis.data.TenisRepository
import com.example.apptenis.ui.TenisScreen
import com.example.apptenis.ui.TenisViewModel
import com.example.apptenis.ui.TenisViewModelFactory

@Composable
fun TenisNavGraph(navController: NavHostController, tenisRepository: TenisRepository) {
    val viewModel: TenisViewModel = viewModel(factory = TenisViewModelFactory(tenisRepository))

    NavHost(navController, startDestination = "tenisScreen") {
        composable("tenisScreen") { TenisScreen(viewModel) }
    }
}
