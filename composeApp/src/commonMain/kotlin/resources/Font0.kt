@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package resources

import kotlin.OptIn
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.FontResource

@ExperimentalResourceApi
private object Font0 {
  val siemens_sans_bold: FontResource =
      FontResource(
        "font:siemens_sans_bold",
          setOf(
            org.jetbrains.compose.resources.ResourceItem(setOf(),
          "font/siemens_sans_bold.ttf"),
          )
      )

}

@ExperimentalResourceApi
internal val siemens_sans_bold: FontResource
  get() = Font0.siemens_sans_bold
