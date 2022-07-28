package com.github.jeffery.base

import android.app.Application

/**
 * 模块中介，模块之间交互
 * @author mxlei
 * @date   2022/7/28
 */
object ModuleMediator {
    const val ACTIVITY_ACCOUNT_CLASS = "com.github.jeffery.account.AccountActivity"
    const val ACTIVITY_SETTING_CLASS = "com.github.jeffery.setting.SettingActivity"
    const val ACTIVITY_PUBLISH_CLASS = "com.github.jeffery.publish.PublishActivity"
    const val ACTIVITY_VIDEO_CLASS = "com.github.jeffery.video.VideoActivity"
    const val ACTIVITY_STORE_CLASS = "com.github.jeffery.store.StoreActivity"

    private const val APP_ACCOUNT_CLASS = "com.github.jeffery.account.App"
    private const val APP_SETTING_CLASS = "com.github.jeffery.setting.App"
    private const val APP_PUBLISH_CLASS = "com.github.jeffery.publish.App"
    private const val APP_VIDEO_CLASS = "com.github.jeffery.video.App"
    private const val APP_STORE_CLASS = "com.github.jeffery.store.App"

    interface AppInitial {
        fun init(app: Application)
    }

    fun init(app: Application) {
        val appClasses = arrayOf(
            APP_ACCOUNT_CLASS, APP_SETTING_CLASS,
            APP_PUBLISH_CLASS, APP_VIDEO_CLASS, APP_STORE_CLASS
        )
        for (claName in appClasses) {
            try {
                val clz = Class.forName(claName)
                val obj = clz.newInstance() as AppInitial
                obj.init(app)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }
    }
}