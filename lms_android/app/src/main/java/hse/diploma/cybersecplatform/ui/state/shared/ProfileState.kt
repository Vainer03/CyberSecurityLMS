package hse.diploma.cybersecplatform.ui.state.shared

import hse.diploma.cybersecplatform.domain.error.ErrorType
import hse.diploma.cybersecplatform.ui.screens.profile.ProfileUiState

sealed class ProfileState {
    data object Loading : ProfileState()

    data class Success(val uiState: ProfileUiState) : ProfileState()

    data class Error(val errorType: ErrorType) : ProfileState()
}
