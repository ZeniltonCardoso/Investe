package br.zc.investe

import android.app.Application
import br.zc.di.modules.dataLocalModule
import br.zc.di.modules.dataModule
import br.zc.di.modules.dataRemoteModule
import br.zc.di.modules.databaseModule
import br.zc.di.modules.domainModule
import br.zc.di.modules.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    dataModule,
                    domainModule,
                    presentationModule,
                    dataRemoteModule,
                    dataLocalModule,
                    databaseModule
                )
            ).androidContext(applicationContext)
        }
    }
}