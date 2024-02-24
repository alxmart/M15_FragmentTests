package com.luizafmartinez.m15_fragmenttests.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.luizafmartinez.m15_fragmenttests.R

class ConversasFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Ciclo_Vida", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Ciclo_Vida", "Fragment onCreateAttach")
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.i("Ciclo_Vida", "Fragment onCreateView")

        //return super.onCreateView(inflater, container, savedInstanceState)

        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )
        return  view
    }

    /*Depreciado
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("Ciclo_Vida", "Fragment onActvityCreated")
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Ciclo_Vida", "Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo_Vida", "Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo_Vida", "Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo_Vida", "Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo_Vida", "Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Ciclo_Vida", "Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo_Vida", "Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Ciclo_Vida", "Fragment onDetach")
    }


}