package features.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * The dimension system for the Scanner Theme.
 */
data class ScannerDimension(
    val dimension1: Dp = 1.dp,
    val dimension2: Dp = 2.dp,
    val dimension4: Dp = 4.dp,
    val dimension6: Dp = 6.dp,
    val dimension8: Dp = 8.dp,
    val dimension10: Dp = 10.dp,
    val dimension12: Dp = 12.dp,
    val dimension14: Dp = 14.dp,
    val dimension16: Dp = 16.dp,
    val dimension18: Dp = 18.dp,
    val dimension20: Dp = 20.dp,
    val dimension24: Dp = 24.dp,
    val dimension28: Dp = 28.dp,
    val dimension32: Dp = 32.dp,
    val dimension36: Dp = 36.dp,
    val dimension40: Dp = 40.dp,
    val dimension42: Dp = 42.dp,
    val dimension44: Dp = 44.dp,
    val dimension46: Dp = 46.dp,
    val dimension48: Dp = 48.dp,
    val dimension56: Dp = 56.dp,
    val dimension58: Dp = 58.dp,
    val dimension62: Dp = 62.dp,
    val dimension64: Dp = 64.dp,
    val dimension72: Dp = 72.dp,
    val dimension82: Dp = 82.dp,
    val dimension92: Dp = 92.dp,
    val dimension102: Dp = 102.dp,
    val dimension122: Dp = 122.dp,
    val dimension128: Dp = 128.dp,
    val dimension180: Dp = 180.dp,
    val dimension200: Dp = 200.dp,
    val dimension225: Dp = 225.dp,
    val dimension256: Dp = 256.dp,
    val dimension350: Dp = 350.dp,
    val dimension400: Dp = 400.dp,
    val dimension450: Dp = 450.dp,
    val dimension550: Dp = 550.dp
)

val LocalDimensions = staticCompositionLocalOf { ScannerDimension() }