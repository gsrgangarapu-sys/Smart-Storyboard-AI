package com.smartstoryboard.ai

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.webkit.WebView

class MainActivity : Activity() {
    private lateinit var web: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.parseColor("#050b1f")
        window.navigationBarColor = Color.parseColor("#071029")
        web = WebView(this).apply {
            setBackgroundColor(Color.parseColor("#050b1f"))
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowFileAccess = false
            loadUrl("file:///android_asset/index.html")
        }
        setContentView(web)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() = finish()
}
