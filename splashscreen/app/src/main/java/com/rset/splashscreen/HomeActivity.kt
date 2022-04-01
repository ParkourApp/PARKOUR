package com.rset.splashscreen


import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val button =findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.signupbutton)
        button.setOnClickListener {
            val intent = Intent(this,signupActivity::class.java)
            startActivity(intent)
        }
        val loginbutton =findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.loginButton)
        loginbutton.setOnClickListener {
            val intent = Intent(this,bufferActivity::class.java)
            startActivity(intent)
        }
        val easterbutton =findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.easterbutton)
        easterbutton.setOnClickListener {
            val intent = Intent(this,EasterEgg1::class.java)
            startActivity(intent)
        }
        supportActionBar?.hide()
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.purp1)
        }
        }

    }