package com.luizafmartinez.m15_fragmenttests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.luizafmartinez.m15_fragmenttests.fragments.ChamadasFragment
import com.luizafmartinez.m15_fragmenttests.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

        /*  val fragmentManager = supportFragmentManager.beginTransaction()
        // Diversas alterações em fragments
        fragmentManager.add( R.id.fragment_conteudo, ConversasFragment() )
        fragmentManager.commit()*/

        btnConversas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo, ConversasFragment() )
                .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo, ChamadasFragment() )
                .commit()
        }
    }
}