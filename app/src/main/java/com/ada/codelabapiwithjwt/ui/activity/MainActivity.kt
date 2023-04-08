package com.ada.codelabapiwithjwt.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ada.codelabapiwithjwt.R
import com.ada.codelabapiwithjwt.storage.Storage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var storage: Storage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("AndroidKotlinAda", "Authenticated user with the JWT ${storage.getToken()}")

    }
}