package com.alialfayed.mvvmcleancode.app

import android.app.Application
import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do : Application Class to get Application Context For All App
 * Create Date 7/15/2021 - 10:59 AM
 * Update Date 9/7/2021 - 8:52 PM
 */
@HiltAndroidApp
class BaseApp : Application() {

}