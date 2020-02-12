package com.example.android.one_page

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.android.one_page.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.submitButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)

//            onSubmitClicked()
        }
    }

    private fun onSubmitClicked() {

        binding.apply {
            invalidateAll()
            username_et.text.toString()
            password_et.text.toString()
        }

        Toast.makeText(
            this,
            "Username: ${username_et.text} \n  \n Password: ${password_et.text}",
            Toast.LENGTH_LONG
        ).show()

        username_et.text.clear()
        password_et.text.clear()
    }
}
