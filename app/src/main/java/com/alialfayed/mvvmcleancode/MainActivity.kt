package com.alialfayed.mvvmcleancode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.alialfayed.mvvmcleancode.app.base.view.BaseActivity
import com.alialfayed.mvvmcleancode.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity(override val layoutResourceId: Int = R.layout.activity_main) : BaseActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onActivityCreated(dataBinder: ActivityMainBinding) {
        dataBinder.dmmy = "Hello Hilt"
    }
}