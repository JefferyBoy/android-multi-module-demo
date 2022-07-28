package com.github.jeffery

import android.os.Bundle
import com.github.jeffery.base.BaseActivity
import com.github.jeffery.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAccount.setOnClickListener {
            startActivity("com.github.jeffery.account.AccountActivity")
        }
        binding.btnPublish.setOnClickListener {
            startActivity("com.github.jeffery.publish.PublishActivity")
        }
        binding.btnStore.setOnClickListener {
            startActivity("com.github.jeffery.store.StoreActivity")
        }
        binding.btnSetting.setOnClickListener {
            startActivity("com.github.jeffery.setting.SettingActivity")
        }
        binding.btnVideo.setOnClickListener {
            startActivity("com.github.jeffery.video.VideoActivity")
        }
    }
}