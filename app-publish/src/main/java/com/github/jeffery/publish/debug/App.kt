package com.github.jeffery.publish.debug

import android.app.Application
import com.github.jeffery.publish.App

/**
 * @author mxlei
 * @date   2022/7/28
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        App().init(this)
    }
}