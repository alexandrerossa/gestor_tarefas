package com.example.gestordetarefas

import android.content.ContentValues
import java.util.*


data class Categorias (

    var nome: String,
    var cor: String,
    var id: Long = -1


){
    fun toContentValues() : ContentValues{
        val values = ContentValues()

        values.put(TabelaCategorias.NOME, nome)
        values.put(TabelaCategorias.COR, cor)
        return values
    }



}