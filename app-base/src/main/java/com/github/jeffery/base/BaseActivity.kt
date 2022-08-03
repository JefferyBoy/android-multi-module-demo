package com.github.jeffery.base

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * @author mxlei
 * @date   2022/7/28
 */
open class BaseActivity : AppCompatActivity() {

    protected fun startActivity(className: String, bundle: Bundle? = null) {
        try {
            val clazz = Class.forName(className)
            val intent = Intent(this, clazz)
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
            Toast.makeText(this, "找不到${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    protected fun startActivityForResult(
        className: String,
        requestCode: Int,
        bundle: Bundle? = null
    ) {
        try {
            val clazz = Class.forName(className)
            val intent = Intent(this, clazz)
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivityForResult(intent, requestCode)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
            Toast.makeText(this, "找不到${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}