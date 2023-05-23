import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import com.example.gestordetarefas.TabelaCategorias

class TabelaTarefas(db: SQLiteDatabase) : TabelaBD(db, NOME_TABELA) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA ($CHAVE_TABELA, $TITULO TEXT NOT NULL, $DESCRICAO TEXT NOT NULL ,$DATA_VENCIMENTO TEXT NOT NULL, $CATEGORIA_FK INTEGER NOT NULL), FOREIGN KEY ($CATEGORIA_FK) REFERENCES ${TabelaCategorias.NOME_TABELA}(${BaseColumns._ID}) ON DELETE RESTRICT")
    }

    companion object {
        const val NOME_TABELA = "Tarefas"
        const val TITULO = "titulo"
        const val DESCRICAO = "descrição"
        const val DATA_VENCIMENTO = "data de vencimento"
        const val CATEGORIA_FK = "id_categoria"

        val CAMPOS = arrayOf(BaseColumns.ID = )
    }
}