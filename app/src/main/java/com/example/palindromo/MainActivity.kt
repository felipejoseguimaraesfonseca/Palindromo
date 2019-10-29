package com.example.palindromo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

fun String.isPalindromo(): String {
    return if (this.toLowerCase() == this.toLowerCase().reversed())
        "${this.toLowerCase()} é um Palíndromo"
    else
        "${this.toLowerCase()} NÃO é um Palíndromo"
}

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        verify.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        text.text = write.text.toString().isPalindromo()
    }
}
