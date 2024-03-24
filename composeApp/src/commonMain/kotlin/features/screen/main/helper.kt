package features.screen.main

import data.enums.QrCodeStatus
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import resources.ic_fail
import resources.ic_success
import resources.ic_warning


@OptIn(ExperimentalResourceApi::class)
fun getQrCodeStatusImageId(status: QrCodeStatus): DrawableResource {
    return when (status){
        QrCodeStatus.SUCCESS -> ic_success
        QrCodeStatus.FAILED -> ic_fail
        QrCodeStatus.WARNING -> ic_warning
    }
}