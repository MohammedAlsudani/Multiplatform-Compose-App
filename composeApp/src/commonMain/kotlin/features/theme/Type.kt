package features.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi

import org.jetbrains.compose.resources.FontResource
import resources.Res
import resources.siemens_sans_bold

/**
 * Scanner font family Siemens Sans.
 */
//@OptIn(ExperimentalResourceApi::class)
//val SiemensSans = FontFamily(
//    Font(siemens_sans_bold, FontWeight.Normal),
//)
@OptIn(ExperimentalResourceApi::class)
val font = FontFamily(Font(siemens_sans_bold))

val SiemensSans = FontFamily.Serif

/**
 * Scanner Theme type system.
 */
data class ScannerTypography (
    val labelXLarge: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = SiemensSans,
        fontSize = 32.sp,
        lineHeight = 34.sp
    ),
    val labelXLargeBold: TextStyle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = SiemensSans,
        fontSize = 32.sp,
        lineHeight = 34.sp
    ),
    val labelLarge: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = SiemensSans,
        fontSize = 24.sp,
        lineHeight = 28.sp
    ),
    val labelLargeBold: TextStyle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = SiemensSans,
        fontSize = 24.sp,
        lineHeight = 28.sp
    ),
    val labelMedium: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = SiemensSans,
        fontSize = 18.sp,
        lineHeight = 21.sp,
    ),
    val labelMediumBold: TextStyle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = SiemensSans,
        fontSize = 18.sp,
        lineHeight = 21.sp,
    ),
    val bodyLarge: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = SiemensSans,
        fontSize = 16.sp,
        lineHeight = 21.sp
    ),
    val bodyLargeBold: TextStyle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = SiemensSans,
        fontSize = 16.sp,
        lineHeight = 21.sp
    ),
    val bodyMedium: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = SiemensSans,
        fontSize = 14.sp,
        lineHeight = 20.sp,
    ),
    val bodyMediumBold: TextStyle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = SiemensSans,
        fontSize = 14.sp,
        lineHeight = 20.sp,
    ),
    val bodySmall: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = SiemensSans,
        fontSize = 12.sp,
        lineHeight = 20.sp,
    ),
    val bodySmallBold: TextStyle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = SiemensSans,
        fontSize = 12.sp,
        lineHeight = 20.sp,
    )
)

val LocalTypography = staticCompositionLocalOf { ScannerTypography() }