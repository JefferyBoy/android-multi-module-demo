package com.github.jeffery

import android.os.Bundle
import com.github.jeffery.base.BaseActivity
import com.github.jeffery.base.ModuleMediator
import com.github.jeffery.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAccount.setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_ACCOUNT_CLASS)
        }
        binding.btnPublish.setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_PUBLISH_CLASS)
        }
        binding.btnStore.setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_STORE_CLASS)
        }
        binding.btnSetting.setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_SETTING_CLASS)
        }
        binding.btnVideo.setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_VIDEO_CLASS)
        }
    }
}