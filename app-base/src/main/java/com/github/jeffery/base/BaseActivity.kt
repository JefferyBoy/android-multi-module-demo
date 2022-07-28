package com.github.jeffery.base

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @author mxlei
 * @date   2022/7/28
 */
open class BaseActivity : AppCompatActivity() {

    protected fun startActivity(className: String, bundle: Bundle? = null) {
        val clazz = Class.forName(className)
        val intent = Intent(this, clazz)
        if (bundle != null) {
            intent.putExtras(bundle)
        }
        startActivity(intent)
    }

    protected fun startActivityForResult(
        className: String,
        requestCode: Int,
        bundle: Bundle? = null
    ) {
        val clazz = Class.forName(className)
        val intent = Intent(this, clazz)
        if (bundle != null) {
            intent.putExtras(bundle)
        }
        startActivityForResult(intent, requestCode)
    }
}