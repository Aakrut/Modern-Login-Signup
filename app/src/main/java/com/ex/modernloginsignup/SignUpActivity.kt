package com.ex.modernloginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.ex.modernloginsignup.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var signUpBinding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


      signUpBinding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = signUpBinding.root
        setContentView(view)

        signup_form()
    }

    private fun signup_form() {
        signUpBinding.buttonSignup.setOnClickListener{
            when {
                signUpBinding.signupEditTextEmail.toString() != "" ->{
                    Toast.makeText(this, "Please Enter Your Email", Toast.LENGTH_SHORT).show()
                }
                signUpBinding.signupEditTextPassword.toString() != "" -> {
                    Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this, "SuccessFully Sign Up.", Toast.LENGTH_SHORT).show()
                }
            }
        }
        signUpBinding.loginText.setOnClickListener {
            startActivity(Intent(this,LogInActivity::class.java))
        }
    }

    override fun onStop() {
        super.onStop()
        onBackPressed()
    }
}