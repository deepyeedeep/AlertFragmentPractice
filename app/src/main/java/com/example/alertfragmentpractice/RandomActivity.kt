package com.example.alertfragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class RandomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
    }

    override fun onResume() {
        super.onResume()
        val txvRandNum = findViewById<TextView>(R.id.txv_randnum)
        val num = intent.getIntExtra("numCnt", 0)
        val valRand = Random.nextInt(0, num)
        txvRandNum.text = valRand.toString()
    }
}