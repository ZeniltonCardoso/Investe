package br.zc.feature_authentication.login

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)
