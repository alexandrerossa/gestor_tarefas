package com.example.gestordetarefas

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.After



import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class BDInstrumentedTest {
    private lateinit var db: TabelaTarefas

    @Before
    fun criaBaseDados() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context, TarefaDB::class.java).build()


    }

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.gestordetarefas", appContext.packageName)
    }

@Test
    fun ConsegueInserirTarefas() {
    val tarefa

    }

    @Test
    fun ConsegueInserirCategorias() {
        val openHelper = BdTarefasOpenHelper(getAppContext())
        val bd = openHelper.writableDatabase


    }
}