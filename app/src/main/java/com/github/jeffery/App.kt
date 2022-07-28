package com.github.jeffery

import android.app.Application
import com.github.jeffery.base.ModuleMediator

/**
 * @author mxlei
 * @date   2022/7/28
 */
class App :Application(){

    override fun onCreate() {
        super.onCreate()
        ModuleMediator.init(this)
    }
}