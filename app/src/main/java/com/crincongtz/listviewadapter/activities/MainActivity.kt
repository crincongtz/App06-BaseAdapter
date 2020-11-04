package com.crincongtz.listviewadapter.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.crincongtz.listviewadapter.R
import com.crincongtz.listviewadapter.adapters.AdapterDirectivos
import com.crincongtz.listviewadapter.models.Directivo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val directivos = ArrayList<Directivo>()
        directivos.add(Directivo(getDrawable(R.mipmap.ic_launcher),"Christian Rincon", "CTO", 1))
        directivos.add(Directivo(getDrawable(R.mipmap.ic_launcher),"Angel Vital", "Gerente", 2))
        directivos.add(Directivo(getDrawable(R.mipmap.ic_launcher),"Damian Manzo", "Jefe de Departamento", 3))
        directivos.add(Directivo(getDrawable(R.mipmap.ic_launcher),"Enrique Diaz", "Tesorero", 4))
        directivos.add(Directivo(getDrawable(R.mipmap.ic_launcher),"Javier Benitez", "Developer 1", 5))
        directivos.add(Directivo(getDrawable(R.mipmap.ic_launcher),"Jesus Solorzano", "Developer 2", 6))
        directivos.add(Directivo(getDrawable(R.mipmap.ic_launcher),"Reymundo Jimenez", "Developer 3", 7))

        val adapterDirectivos = AdapterDirectivos(this, directivos)
        listaDirectivos.adapter = adapterDirectivos
        listaDirectivos.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this, "Click en: ${directivos[position]}", Toast.LENGTH_LONG).show()
        }
    }
}
