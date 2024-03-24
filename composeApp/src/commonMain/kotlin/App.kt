import androidx.compose.runtime.*
import features.component.ScannerScaffold
import features.theme.ScannerTheme
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    ScannerTheme {
        ScannerScaffold {
            ScannerApp()
        }
    }
}