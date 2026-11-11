package com.stormgamesstudios.cardinalaidualmodel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var myWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWebView = findViewById(R.id.myWebView)

        // Habilita JavaScript (si es necesario para la página)
        myWebView.settings.javaScriptEnabled = true

        // Evita que los enlaces se abran en el navegador externo
        myWebView.webViewClient = WebViewClient()

        // Carga la URL de la página que quieres mostrar
        myWebView.loadUrl("https://cardinal-ai-web.vercel.app")
    }

    // Maneja la navegación hacia atrás dentro del WebView
    override fun onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}