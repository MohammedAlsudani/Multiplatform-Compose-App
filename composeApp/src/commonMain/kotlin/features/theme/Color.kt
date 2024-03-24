package features.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

/**
 * Scanner Theme color system.
 */
val colorGreen = Color(0xFF00FFB9)
val MediumGray = Color(0xFF23233C)
val EerieBlack = Color(0xFF000028)
val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)
val colorLightGreen = Color(0xFF00CCCC)
val colorLightBlack = Color(0xFF000028)




// Dark Color Scheme
val DarkColorScheme = darkColors(
    primary = colorGreen,
    secondary = MediumGray,
    background = EerieBlack,
    surface = Black,
    onPrimary = White,
    onSecondary = White,
    onBackground = White,
    onSurface = White
)

// Light Color Scheme
val LightColorScheme = lightColors(
    primary = colorGreen,
    secondary = MediumGray,
    background = EerieBlack,
    surface = Black,
    onPrimary = White,
    onSecondary = White,
    onBackground = White,
    onSurface = White
)