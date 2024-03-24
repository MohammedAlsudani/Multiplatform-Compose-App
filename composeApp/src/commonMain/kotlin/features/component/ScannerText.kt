package features.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import features.theme.ScannerTheme
import org.jetbrains.compose.ui.tooling.preview.Preview


/**
 * Composable function for displaying text with Scanner App styling.
 *
 * @param text The text to display.
 * @param modifier The modifier to be applied to the text.
 * @param color The color of the text.
 * @param fontSize The size of the text.
 * @param letterSpacing The spacing between characters in the text.
 * @param textAlign The alignment of the text within its layout bounds.
 * @param style The style to apply to the text.
 * @param lineHeight The height of each line of the text.
 * @param maxLines The maximum number of lines to display.
 * @param overflow The behavior of the text when it overflows its layout bounds.
 */
@Composable
fun ScannerText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = ScannerTheme.colors.primary,
    fontSize: TextUnit = TextUnit.Unspecified,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    style: TextStyle = ScannerTheme.typography.labelMedium,
    lineHeight: TextUnit = TextUnit.Unspecified,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip
) {
    Text(
        text = AnnotatedString(text),
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        letterSpacing = letterSpacing,
        textAlign = textAlign,
        style = style,
        lineHeight = lineHeight,
        maxLines = maxLines,
        overflow = overflow
    )
}

/**
 * Preview function for the ScannerText.
 * It provides a preview of how the ScannerText appears.
 */
@Preview
@Composable
private fun BodyPreview() {
    ScannerText("Scanner Text", Modifier)
}
