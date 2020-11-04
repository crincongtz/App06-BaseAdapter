package com.crincongtz.listviewadapter.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.crincongtz.listviewadapter.R
import com.crincongtz.listviewadapter.models.Directivo

class AdapterDirectivos(val context: Context, val listItem: ArrayList<Directivo>) : BaseAdapter() {

    override fun getView(position: Int, view: View?, group: ViewGroup?): View {
        var myView = view

        val directivo = getItem(position) as Directivo // Este es un CAST
//        val directivo2 = listItem[position]

        if (myView == null) {
            val inflater: LayoutInflater = LayoutInflater.from(context)
            myView = inflater.inflate(R.layout.item_list, null)
//            myView = LayoutInflater.from(context).inflate(R.layout.item_list, null)
        }

        val imageView = myView!!.findViewById<ImageView>(R.id.imageView)
        imageView.setImageDrawable(directivo.photo)

        val nombreView = myView.findViewById<TextView>(R.id.nombre_directivo)
        nombreView.text = directivo.nombre

        val cargoView = myView.findViewById<TextView>(R.id.cargo_directivo)
        cargoView.text = directivo.cargo

        return myView
    }

    override fun getItem(position: Int): Any {
        return listItem[position]
    }

    //    override fun getItemId(position: Int) = listItem[position].id

    override fun getItemId(position: Int): Long {
        return listItem[position].id
    }

// ----------------------------------------

//    override fun getCount(): Int {
//        return listItem.size
//    }

    override fun getCount() = listItem.size


}