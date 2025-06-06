package hse.diploma.cybersecplatform.domain.repository

import hse.diploma.cybersecplatform.data.model.response.MessageResponse
import hse.diploma.cybersecplatform.data.model.response.TempTokenResponse
import hse.diploma.cybersecplatform.domain.model.AppTheme
import hse.diploma.cybersecplatform.domain.model.Language
import kotlinx.coroutines.flow.Flow

interface SettingsRepo {
    fun getThemePreference(): Flow<AppTheme>

    suspend fun setThemePreference(theme: AppTheme)

    fun getLanguagePreference(): Flow<Language>

    suspend fun setLanguagePreference(language: Language)

    suspend fun initiatePasswordUpdate(
        currentPassword: String,
        newPassword: String,
    ): Result<TempTokenResponse>

    suspend fun confirmPasswordUpdate(
        otpValue: String,
        tempToken: String,
    ): Result<MessageResponse>
}
