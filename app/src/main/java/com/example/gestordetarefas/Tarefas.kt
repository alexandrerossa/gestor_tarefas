package com.example.gestordetarefas

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns
import java.util.*


data class Tarefas(

    var titulo: String,
    var descricao: Long,
    var data_vencimento: Date,
    var id_categoria: Long,
    var id: Long = -1


){
    fun toContentValues() : ContentValues{
        val values = ContentValues()

        values.put(TabelaTarefas.TITULO, titulo)
        values.put(TabelaTarefas.DESCRICAO, descricao)
        values.put(TabelaTarefas.DATA_VENCIMENTO, data_vencimento)
        values.put(TabelaTarefas.CATEGORIA_FK, id_categoria)
        return values
    }

    companion object{

        fun fromCursor(cursor: Cursor) : Tarefas {
            val posID = cursor.getColumnIndex(BaseColumns._ID)
            val posDescricao = cursor.getColumnIndex(TabelaTarefas.DESCRICAO)

            val id = cursor.getLong(posID)
            val descricao = cursor.getString(posDescricao)

            return Tarefas(descricao, id)
        }

    }


}
