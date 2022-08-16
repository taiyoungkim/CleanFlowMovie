package com.example.cleanflowmovie.module

import com.example.cleanflowmovie.utils.NetworkManager
import org.koin.core.module.Module
import org.koin.dsl.module

val networkModule: Module = module {
    single { NetworkManager(get()) }
}