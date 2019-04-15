package com.example.kotlinmvvmtraining.view

import android.os.Bundle
import com.example.kotlinmvvmtraining.R
import com.example.kotlinmvvmtraining.base.BaseActivity
import com.example.kotlinmvvmtraining.databinding.ActivityMainBinding
import com.example.kotlinmvvmtraining.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResourceId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    override fun initStartView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initDataBinding() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initAfterBinding() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
