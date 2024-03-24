package features.screen.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import features.theme.ScannerTheme
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import resources.ic_logo
import resources.ic_scan


/**
 * Composable function for the start screen.
 *
 * @param mainViewModel ViewModel for managing data and UI state.
 */
@OptIn(ExperimentalResourceApi::class)
@Composable
fun StartScreen(mainViewModel: MainViewModel) {
    Column(modifier = Modifier.fillMaxSize()) {
        // Top section with logo and greeting
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Column(modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(
                    start = ScannerTheme.dimensions.dimension24,
                    bottom = ScannerTheme.dimensions.dimension122
                ),
                verticalArrangement = Arrangement.spacedBy(ScannerTheme.dimensions.dimension16)) {
                // Logo
                Image(
                    modifier = Modifier,
                    painter = painterResource(ic_logo),
                    contentDescription = "dxb_word_mark"
                )
                // Greeting
                Text(
                    text = "Hello, Jonathan",
                    style = ScannerTheme.typography.labelXLargeBold
                )
            }
        }
        // Bottom section with scan button
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(0.6f)) {
            Box(modifier = Modifier
                .clip(RoundedCornerShape(
                    topStart = ScannerTheme.dimensions.dimension24,
                    topEnd = ScannerTheme.dimensions.dimension24)
                )
                .fillMaxSize()
                .background(ScannerTheme.colors.secondary), contentAlignment = Alignment.Center) {
                Column(modifier = Modifier
                    .clip(RoundedCornerShape(ScannerTheme.dimensions.dimension24))
                    .clickable { mainViewModel.onScanLocationQRCode() }
                    .padding(ScannerTheme.dimensions.dimension24),
                    verticalArrangement = Arrangement.spacedBy(ScannerTheme.dimensions.dimension16),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Scan icon
                    Image(
                        modifier = Modifier,
                        painter = painterResource(ic_scan),
                        contentDescription = "ic_scan"
                    )
                    // Scan button text
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Click here to Scan your Location QR Code",
                        style = ScannerTheme.typography.labelMediumBold,
                        color = ScannerTheme.colors.primary
                    )
                }
            }
        }
    }
}