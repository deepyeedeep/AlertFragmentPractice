package com.example.alertfragmentpractice

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttAlert = findViewById<Button>(R.id.butt_alert)
        val buttCount = findViewById<Button>(R.id.butt_count)
        val buttRandom = findViewById<Button>(R.id.butt_random)
        val txvCnt = findViewById<TextView>(R.id.txv_count)
        var numCnt = 0
        val intent = Intent(this, RandomActivity::class.java)
        val dlgCountInit: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity, R.style.Theme_AlertFragmentPractice)
        dlgCountInit.apply {
            setTitle(R.string.frg_title_count_init)
            setMessage(R.string.frg_txt_count_init)
            setPositiveButton(
                R.string.frg_butt_pos,
                DialogInterface.OnClickListener {
                        dialog,
                        which -> run {
                    numCnt = 0
                    txvCnt.text = numCnt.toString()
                        } })
            setNeutralButton(
                R.string.frg_butt_neut,
                DialogInterface.OnClickListener{ dialog,
                        id -> run {
                        Toast.makeText(applicationContext, R.string.frg_neut_toast, Toast.LENGTH_SHORT ).show()
                    }
                })
            setNegativeButton(R.string.frg_butt_neg, DialogInterface.OnClickListener{ dialog, id -> })
        }
        buttAlert.setOnClickListener {
            dlgCountInit.show()
        }

        buttCount.setOnClickListener {
            numCnt++
            txvCnt.text = numCnt.toString()
        }

        buttRandom.setOnClickListener {

        }
    }
}