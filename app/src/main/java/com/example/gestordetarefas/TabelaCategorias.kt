package com.example.gestordetarefas

import TabelaBD
import android.database.sqlite.SQLiteDatabase;

class TabelaCategorias(db: SQLiteDatabase) : TabelaBD(db, NOME_TABELA) {

    override fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA ($CHAVE_TABELA, $NOME TEXT NOT NULL, $COR TEXT NOT NULL)")
    }

    companion object {
        const val NOME_TABELA = "Categorias"
        const val NOME = "nome"
        const val COR = "cor"
    }

}