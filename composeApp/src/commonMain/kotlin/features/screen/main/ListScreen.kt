package features.screen.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import data.model.QrItem
import features.component.ProfileRow
import features.theme.ScannerTheme
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import resources.ic_camera
import resources.ic_scan

/**
 * Composable function for the main list screen.
 *
 * @param mainViewModel ViewModel for the main screen.
 */
@Composable
fun ListScreen(mainViewModel: MainViewModel) {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(ScannerTheme.dimensions.dimension16),
                contentPadding = PaddingValues(ScannerTheme.dimensions.dimension16)
            ) {
                items(mainViewModel.qrItemList) { qrItem ->
                    QrItemRow(qrItem = qrItem,
                        onClick = {mainViewModel.onEnterQrTag()})
                }
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            ActionBottom(mainViewModel)
        }
    }
}

/**
 * Composable function for displaying a row of QR item.
 *
 * @param qrItem QR code item to display.
 */
@OptIn(ExperimentalResourceApi::class)
@Composable
fun QrItemRow(qrItem: QrItem, onClick:() -> Unit) {
    Row(
        modifier = Modifier
            .clickable { onClick() }
            .clip(RoundedCornerShape(ScannerTheme.dimensions.dimension4))
            .background(ScannerTheme.colors.secondary)
            .fillMaxWidth()
            .padding(ScannerTheme.dimensions.dimension16),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = qrItem.text,
            style = ScannerTheme.typography.labelMediumBold,
            color = ScannerTheme.colors.primary
        )
        Image(
            modifier = Modifier.size(ScannerTheme.dimensions.dimension28),
            painter = painterResource(getQrCodeStatusImageId(qrItem.status)),
            contentDescription = "Qr Code Status Image"
        )
    }
}

/**
 * Composable function for displaying action buttons at the bottom of the screen.
 *
 * @param mainViewModel ViewModel for the main screen.
 */
@Composable
fun ActionBottom(mainViewModel: MainViewModel) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(ScannerTheme.dimensions.dimension8),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(ScannerTheme.dimensions.dimension8)
    ) {
        ActionRow(mainViewModel)
        ProfileRow(mainViewModel)
    }
}

/**
 * Composable function for displaying an action row.
 *
 * @param mainViewModel ViewModel for the main screen.
 */
@OptIn(ExperimentalResourceApi::class)
@Composable
fun ActionRow(mainViewModel: MainViewModel) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(ScannerTheme.dimensions.dimension4))
            .clickable {
                mainViewModel.onEnterQrTag()
            }
            .background(ScannerTheme.colors.secondary)
            .fillMaxWidth()
            .padding(ScannerTheme.dimensions.dimension16)
           ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "NZ458 @ Dep Gate 13",
            style = ScannerTheme.typography.bodyLargeBold,
            color = ScannerTheme.colors.primary
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(ScannerTheme.dimensions.dimension24)
        ) {
            Image(
                modifier = Modifier.size(ScannerTheme.dimensions.dimension28),
                painter = painterResource(ic_camera),
                contentDescription = "Qr Code Status Image"
            )
            Image(
                modifier = Modifier.size(ScannerTheme.dimensions.dimension28),
                painter = painterResource(ic_scan),
                contentDescription = "Qr Code Status Image"
            )
        }
    }
}
