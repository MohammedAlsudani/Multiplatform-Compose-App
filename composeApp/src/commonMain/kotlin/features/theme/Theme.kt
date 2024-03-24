package features.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider


/**
 * Theme object that provides access to [ScannerTheme] systems via convenience properties.
 */
object ScannerTheme {

    val colors
        @Composable
        get() = MaterialTheme.colors

    val typography: ScannerTypography
        @Composable
        get() = LocalTypography.current

    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes

    val dimensions: ScannerDimension
        @Composable
        get() = LocalDimensions.current
}


@Composable
fun ScannerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    typography: ScannerTypography = ScannerTheme.typography,
    dimension: ScannerDimension = ScannerTheme.dimensions,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    CompositionLocalProvider(
        LocalTypography provides typography,
        LocalDimensions provides dimension) {
        MaterialTheme(
            colors = colorScheme,
            content = content
        )
    }
}