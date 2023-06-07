package com.example.thesocialnetwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import login.LoginActivity
import singUp.SingUpActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1=findViewById<Button>(R.id.activityOne)

        boton1.setOnClickListener {
            val lanzar=Intent(this,LoginActivity::class.java)
            startActivity(lanzar)
        }
        val boton2=findViewById<Button>(R.id.activityTwo)

        boton2.setOnClickListener {
            val lanzar=Intent(this,SingUpActivity::class.java)
            startActivity(lanzar)
        }


    }
}