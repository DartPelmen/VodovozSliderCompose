package com.ivankuznetsov.sliderforvodovoz

import android.app.Application
import com.ivankuznetsov.sliderforvodovoz.data.repository.SliderRepository
import com.ivankuznetsov.sliderforvodovoz.data.repository.SliderRepositoryImpl
import com.ivankuznetsov.sliderforvodovoz.data.viewmodel.SliderViewModel
import com.ivankuznetsov.sliderforvodovoz.network.NetworkObject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.module

/**
 * Здесь описывается DI
 * */
val sliderModule = module {
    single<SliderRepository> {
        SliderRepositoryImpl(NetworkObject.retrofit)
    }
    viewModel { SliderViewModel(get()) }
}

class SlliderForVodovozApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@SlliderForVodovozApp)
            modules(sliderModule)
        }
    }
}