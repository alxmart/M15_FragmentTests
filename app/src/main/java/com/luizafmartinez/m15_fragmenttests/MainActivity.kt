package com.luizafmartinez.m15_fragmenttests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.os.bundleOf
import com.luizafmartinez.m15_fragmenttests.fragments.ChamadasFragment
import com.luizafmartinez.m15_fragmenttests.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnMercado: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Ciclo_Vida", "Activity onCreate")

        btnMercado = findViewById(R.id.btn_mercado)
        btnChamadas = findViewById(R.id.btn_chamadas)

        /*  val fragmentManager = supportFragmentManager.beginTransaction()
        // Diversas alterações em fragments
        fragmentManager.add( R.id.fragment_conteudo, ConversasFragment() )
        fragmentManager.commit()*/

        //Para remover um fragment:
        //val conversasFragment = ConversasFragment()

        btnMercado.setOnClickListener {

            val conversasFragment = ConversasFragment()

            // passar dados de uma activity p/ outra, usa putExtra
            // passar dados para um fragment , usa arguments

            val bundle = bundleOf(

                "categoria" to "mercado",
                "usuario" to "Jamilton"
            )

            conversasFragment.arguments = bundle

            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo, conversasFragment )
                .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo, ChamadasFragment() )
                // Para remover:
                // .remove ( conversasFragment)
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo_Vida", "Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo_Vida", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo_Vida", "Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo_Vida", "Activity onStop")
    }

    override fun onDestroy() {
        Log.i("Ciclo_Vida", "Activity onDestroy")
        super.onDestroy()
    }

}