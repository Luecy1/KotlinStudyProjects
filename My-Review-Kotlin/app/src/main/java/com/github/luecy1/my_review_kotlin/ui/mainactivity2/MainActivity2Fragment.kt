package com.github.luecy1.my_review_kotlin.ui.mainactivity2

import android.arch.lifecycle.ViewModelProviders
import android.inputmethodservice.Keyboard
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.luecy1.my_review_kotlin.R
import com.github.luecy1.my_review_kotlin.data.Row
import kotlinx.android.synthetic.main.main_activity2_fragment.*

class MainActivity2Fragment : Fragment() {

    companion object {
        fun newInstance() = MainActivity2Fragment()
    }

    private lateinit var viewModel: MainActivity2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_activity2_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainActivity2ViewModel::class.java)

        val list = mutableListOf<Row>()

        for (i in 1..50) {
            list.add(
                Row("${i}個目")
            )
        }

        recycler_view.adapter = MyRecyclerAdapter(context!!,list)
        recycler_view.layoutManager = LinearLayoutManager(context)
    }

}
