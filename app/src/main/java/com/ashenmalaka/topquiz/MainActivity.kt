package com.ashenmalaka.topquiz

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

internal class MainActivity : AppCompatActivity() {
    private var mGreetingText: TextView? = null
    private var mNameInput: EditText? = null
    private var mPlayButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mGreetingText =
            findViewById<View>(R.id.activity_main_greeting_txt) as TextView
        mNameInput = findViewById<View>(R.id.activity_main_name_input) as EditText
        mPlayButton =
            findViewById<View>(R.id.activity_main_play_btn) as Button
        mPlayButton!!.isEnabled = false
        mNameInput!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                s: CharSequence,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence,
                start: Int,
                before: Int,
                count: Int
            ) {
                mPlayButton!!.isEnabled = s.toString().isNotEmpty()
            }

            override fun afterTextChanged(s: Editable) {}
        })
        mPlayButton!!.setOnClickListener { }
    }
}