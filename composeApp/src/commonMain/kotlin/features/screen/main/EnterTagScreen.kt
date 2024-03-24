package features.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import features.component.ProfileRow
import features.theme.ScannerTheme
import features.theme.colorLightBlack
import features.theme.colorLightGreen
/**
 * Composable function for the enter tag screen.
 *
 * @param mainViewModel The MainViewModel to handle interactions and data.
 */
@Composable
fun EnterTagScreen(mainViewModel: MainViewModel) {
    var text by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(ScannerTheme.dimensions.dimension24)
                .weight(1f)
        ) {
            Column(modifier = Modifier
                .background(ScannerTheme.colors.secondary)
                .padding(ScannerTheme.dimensions.dimension16)
                .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(ScannerTheme.dimensions.dimension16),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(modifier = Modifier.fillMaxWidth(),
                    text = "Enter Bag Tag # to search for",
                    style = ScannerTheme.typography.labelMediumBold)
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                    ),
                    value = text, onValueChange = { text = it },
                    textStyle = ScannerTheme.typography.labelMediumBold,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
                )
                Button(shape = RoundedCornerShape(0.dp),
                    onClick = {
                        mainViewModel.onStart()
                    },
                    colors =  ButtonDefaults.buttonColors(colorLightGreen),
                    modifier = Modifier.fillMaxWidth()) {
                    Text(text = "confirm",
                        style = ScannerTheme.typography.bodySmallBold,
                        color = colorLightBlack
                    )
                }
            }
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            EnterTagBottom(mainViewModel)
        }
    }
}

/**
 * Composable function for the bottom section of the enter tag screen.
 *
 * @param mainViewModel The MainViewModel to handle interactions and data.
 */
@Composable
fun EnterTagBottom(mainViewModel: MainViewModel) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(ScannerTheme.dimensions.dimension8),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(ScannerTheme.dimensions.dimension8)
    ) {
        ProfileRow(mainViewModel)
    }
}


