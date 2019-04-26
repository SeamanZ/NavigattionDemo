package com.example.navigattiondemo


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        settingsButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_mainFragment_to_settingsFragment,
                null
            )
        )

        detailButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_mainFragment_to_detailFragment,
                null
            )
        )

        shoppingCartButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_mainFragment_to_shoppingCartFragment,
                null
            )
        )
    }
}
