package com.luizafmartinez.m15_fragmenttests.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.luizafmartinez.m15_fragmenttests.R

//class ConversasFragment : Fragment( R.layout.fragment_conversas) {
class ConversasFragment : Fragment() {

    private lateinit var btnExecutar: Button
    private lateinit var editNome: EditText
    private lateinit var textNome: TextView
    private lateinit var textCategoria: TextView

    private var categoria : String? = null
    private var usuario : String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Ciclo_Vida", "Fragment onAttach")
    }

    // Pode receber as informações passadas como parêmetro
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Log.i("Ciclo_Vida", "Fragment onCreateAttach")

        categoria = arguments?.getString("categoria")
        usuario = arguments?.getString("usuario")
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

        btnExecutar = view.findViewById(R.id.btn_executar) //Precisa de view.
        editNome = view.findViewById(R.id.edit_nome)
        textNome = view.findViewById(R.id.text_nome)
        textCategoria = view.findViewById(R.id.text_categoria)

        textCategoria.text = categoria
        textNome.text = usuario


        btnExecutar.setOnClickListener {

            val nome = editNome.text.toString()
            textNome.text = nome
        }

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