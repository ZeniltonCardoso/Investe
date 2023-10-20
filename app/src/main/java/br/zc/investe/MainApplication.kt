package br.zc.investe

import android.app.Application
import br.zc.di.dataLocalModule
import br.zc.di.dataModule
import br.zc.di.dataRemoteModule
import br.zc.di.databaseModule
import br.zc.di.domainModule
import br.zc.di.presentationModule
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