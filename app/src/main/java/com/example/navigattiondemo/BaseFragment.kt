package com.example.navigattiondemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment


/**
 * Created by Seaman on 2019-04-26.
 * Bangggood Ltd
 */
abstract class BaseFragment : Fragment() {

    val logTag: String by lazy {
        "${this.javaClass.simpleName}_${this.hashCode()}"
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v(logTag, "------------->onAttach")
        requireActivity().onBackPressedDispatcher.addCallback(this, OnBackPressedCallback {
            Log.i(logTag, "onBackPressedDispatcher - $logTag")
            return@OnBackPressedCallback false
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(logTag, "------------->onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v(logTag, "------------->onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.v(logTag, "------------->onActivityCreated")
        activity?.apply {
            title = logTag
        }
    }

    override fun onStart() {
        super.onStart()
        Log.v(logTag, "------------->onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v(logTag, "------------->onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v(logTag, "------------->onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v(logTag, "------------->onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.v(logTag, "------------->onDestroyView")
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        Log.v(logTag, "------------->onCreateOptionsMenu")
    }

    override fun onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu()
        Log.v(logTag, "------------->onDestroyOptionsMenu")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(logTag, "------------->onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v(logTag, "------------->onDetach")
    }

}