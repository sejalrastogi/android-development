package com.example.birthdaygreetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greetings.*

class GreetingsActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayCard.text = "Happy Birthday\n$name!"
    }
}