package com.ex.modernloginsignup

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.ex.modernloginsignup.databinding.ActivityMainBinding

class LogInActivity : AppCompatActivity() {

    private  lateinit var  mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        val constraintLayout : ConstraintLayout = mainBinding.root

        val animationDrawable : AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(2000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()

        login_form()
    }

    private fun login_form() {
            mainBinding.buttonLogin.setOnClickListener{
                when {
                    mainBinding.loginEditTextEmail.toString() != "" -> {
                        Toast.makeText(this, "Please Enter Your Email", Toast.LENGTH_SHORT).show()
                    }

                    mainBinding.loginEditTextPassword.toString() != "" -> {
                        Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show()
                    }

                    else -> {
                        Toast.makeText(this, "SuccessFully Logged In", Toast.LENGTH_SHORT).show()
                    }
                }
            }

        mainBinding.fogotPassword.setOnClickListener {
            Toast.makeText(this, "Forgot Password", Toast.LENGTH_SHORT).show()
        }
    }
}