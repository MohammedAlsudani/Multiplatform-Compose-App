package features.screen.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import features.component.ScannerLeftIconText
import features.theme.ScannerTheme
import data.enums.MainState
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import resources.ic_calendar_month
import resources.ic_clock

/**
 * Composable function for the main screen of the Scanner App.
 * This function defines the UI for the main screen where the scanning functionality is presented.
 *
 * @param mainViewModel The view model for managing data and state related to the main screen.
 */
@Preview
@Composable
fun MainScreen() {
    val mainViewModel = MainViewModel()
    MainContent(mainViewModel)
}

/**
 * Composable function for displaying the main content of the main screen.
 * This function delegates rendering of different screens based on the current UI state.
 *
 * @param mainViewModel The view model for managing data and state related to the main screen.
 */
@Composable
fun MainContent(mainViewModel: MainViewModel) {
    val currentUiState by mainViewModel.uiState.collectAsState()
    Column(modifier = Modifier.fillMaxSize()) {
        MainHeader(mainViewModel)
        when (currentUiState.currentState) {
            MainState.START -> StartScreen(mainViewModel)
            MainState.LIST -> ListScreen(mainViewModel)
            MainState.ENTER_TAG -> EnterTagScreen(mainViewModel)
        }
    }
}

/**
 * Composable function for displaying the header of the main screen.
 *
 * @param mainViewModel The view model for managing data and state related to the main screen.
 */
@OptIn(ExperimentalResourceApi::class)
@Composable
fun MainHeader(mainViewModel: MainViewModel) {
    Row(modifier = Modifier.fillMaxWidth()
        .padding(start = ScannerTheme.dimensions.dimension24,
            end = ScannerTheme.dimensions.dimension24,
            top = ScannerTheme.dimensions.dimension12),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        ScannerLeftIconText(text = "21 Mar",
            icon = painterResource(ic_calendar_month),
            style = ScannerTheme.typography.bodyLargeBold)
        ScannerLeftIconText(text = "12:00",
            icon = painterResource(ic_clock),
            style = ScannerTheme.typography.bodyLargeBold)
    }
}
