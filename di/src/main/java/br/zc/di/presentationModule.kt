package br.zc.di

import br.zc.feature_authentication.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
  viewModel { LoginViewModel() }
}
