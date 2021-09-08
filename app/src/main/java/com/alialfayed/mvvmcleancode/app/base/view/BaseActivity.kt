package com.alialfayed.mvvmcleancode.app.base.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 9/7/2021 - 9:25 PM
 */
abstract class BaseActivity<in T> : AppCompatActivity() where T : ViewDataBinding{

    abstract fun onActivityCreated(dataBinder : T)

    @get:LayoutRes
    protected abstract val layoutResourceId : Int

    final override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        this@BaseActivity.initial()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this@BaseActivity.initial()
    }

    private fun initial(){
        this@BaseActivity.layoutResourceId.let {
            val dataBinder = DataBindingUtil.setContentView<T>(this@BaseActivity , it)
            this@BaseActivity.onActivityCreated(dataBinder)
        }
    }













}