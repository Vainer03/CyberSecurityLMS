package hse.diploma.cybersecplatform.ui.screens.auth

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import hse.diploma.cybersecplatform.WithTheme
import hse.diploma.cybersecplatform.ui.state.screen_state.AuthorizationScreenState

@Composable
@Preview(showBackground = true, apiLevel = 30)
fun PreviewAuthorizationScreen() =
    WithTheme {
        val state =
            AuthorizationScreenState(
                username = TextFieldValue("test@example.com"),
                password = TextFieldValue("password123"),
                isAuthorizationEnabled = true,
            )

        AuthorizationScreen(
            state = state,
            onUsernameChange = {},
            onPasswordChange = {},
            onLoginClick = {},
            onNavigateToRegistration = {},
            onOtpSubmit = {},
            onOtpDismiss = {},
            onErrorDismiss = {},
            isOtpLoading = false,
        )
    }
