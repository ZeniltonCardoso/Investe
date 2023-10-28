package br.zc.feature_main.login

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)
