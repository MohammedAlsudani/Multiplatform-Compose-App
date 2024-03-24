package features.screen.main

import com.rickclephas.kmm.viewmodel.KMMViewModel
import data.enums.MainState
import data.enums.QrCodeStatus
import data.model.QrItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


/**
 * ViewModel for the main screen of the scanner application.
 *
 * This ViewModel manages the UI state and QR code list for the main screen.
 */
class MainViewModel : KMMViewModel() {

    // UI state flow
    private val _uiState = MutableStateFlow(MainUiState())
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()

    // List of QR codes
    val qrItemList: List<QrItem> = listOf(
        QrItem(text = "08693662631", status = QrCodeStatus.SUCCESS),
        QrItem(text = "08693662631", status = QrCodeStatus.WARNING),
        QrItem(text = "08693662631", status = QrCodeStatus.FAILED),
        QrItem(text = "08693662631", status = QrCodeStatus.SUCCESS)
    )

    /**
     * Function to handle scanning location QR code.
     * Updates the UI state to show the list of scanned QR codes.
     */
    fun onScanLocationQRCode() {
        _uiState.update { it.copy(currentState = MainState.LIST) }
    }

    /**
     * Function to handle entering a QR tag.
     * Updates the UI state to show the enter tag screen.
     */
    fun onEnterQrTag() {
        _uiState.update { it.copy(currentState = MainState.ENTER_TAG) }
    }

    /**
     * Function to handle starting the main screen.
     * Updates the UI state to the initial state.
     */
    fun onStart() {
        _uiState.update { it.copy(currentState = MainState.START) }
    }
}

/**
 * Data class representing the UI state of the main screen.
 *
 * @property currentState The current state of the main screen.
 */
data class MainUiState(
    val currentState: MainState = MainState.START,
)