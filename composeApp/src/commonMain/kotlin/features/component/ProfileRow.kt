package features.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import features.screen.main.MainViewModel
import features.theme.ScannerTheme
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import resources.ic_logo

/**
 * Composable function for displaying a profile row.
 *
 * @param mainViewModel ViewModel for the main screen.
 */
@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProfileRow(mainViewModel: MainViewModel) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(ScannerTheme.dimensions.dimension4))
            .background(ScannerTheme.colors.secondary)
            .fillMaxWidth()
            .padding(ScannerTheme.dimensions.dimension16),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Jonathan",
            style = ScannerTheme.typography.labelMediumBold
        )
        Image(
            modifier = Modifier.height(ScannerTheme.dimensions.dimension28),
            painter = painterResource(ic_logo),
            contentDescription = "Qr Code Status Image"
        )
    }
}