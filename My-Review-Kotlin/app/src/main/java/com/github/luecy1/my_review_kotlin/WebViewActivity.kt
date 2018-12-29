package com.github.luecy1.my_review_kotlin

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class WebViewActivity : AppCompatActivity(), WebviewTest.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity2_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, WebviewTest.newInstance("", ""))
                .commitNow()
        }
    }


    override fun onFragmentInteraction(uri: Uri) {
    }


}