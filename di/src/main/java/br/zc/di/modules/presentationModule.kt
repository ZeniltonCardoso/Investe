package br.zc.di.modules

import br.zc.feature_main.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
  viewModel { LoginViewModel() }
}
