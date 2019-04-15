package com.example.kotlinmvvmtraining.di

import com.example.kotlinmvvmtraining.model.DataModel
import com.example.kotlinmvvmtraining.model.DataModelImpl
import com.example.kotlinmvvmtraining.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

var modelPart = module {
    factory<DataModel> {
        DataModelImpl()
    }
}

    var viewModelPart = module {
        viewModel {
            MainViewModel(get ())
        }
    }

    var myDiModule = listOf(modelPart, viewModelPart)
