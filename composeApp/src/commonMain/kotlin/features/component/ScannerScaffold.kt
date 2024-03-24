package features.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import features.theme.ScannerTheme
import org.jetbrains.compose.ui.tooling.preview.Preview


/**
 * Composable function for creating a Scaffold with Scanner App styling.
 *
 * @param modifier The modifier to be applied to the Scaffold.
 * @param topBar The composable function that represents the top app bar.
 * @param bottomBar The composable function that represents the bottom app bar.
 * @param floatingActionButton The composable function that represents the floating action button.
 * @param backgroundColor The background color of the Scaffold.
 * @param contentColor The content color of the Scaffold.
 * @param content The content of the Scaffold, represented as a composable function that takes PaddingValues.
 */
@Composable
fun ScannerScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit) = {},
    bottomBar: @Composable () -> Unit = {},
    floatingActionButton: @Composable (() -> Unit) = {},
    backgroundColor: Color = ScannerTheme.colors.background,
    contentColor: Color = contentColorFor(backgroundColor),
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier,
        topBar = topBar,
        content = content,
        bottomBar = bottomBar,
        contentColor = contentColor,
        floatingActionButton = floatingActionButton,
        floatingActionButtonPosition = FabPosition.Center
    )
}

/**
 * Preview function for the ScannerScaffold.
 * It provides a preview of how the ScannerScaffold appears.
 */
@Preview
@Composable
private fun BodyPreview() {
    ScannerScaffold {

    }
}