package com.enterprise.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var button: Button? = null
    private val manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button?.setOnClickListener(View.OnClickListener {

            showFragmentOne()

        })



    }

    private fun showFragmentOne() {

        val transaction = manager.beginTransaction()
        val fragmentOne = FragmentOne.newInstance("test1", "test2")
        transaction.replace(R.id.frameLayout, fragmentOne)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}