package br.com.motivation

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {

    //  utilizado p/ armazenar pequenas partes de dados em pares de chave-valor de forma persistente
    private val secutiry: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    //salvar valor
    fun storeString(chave: String, str: String) {
        secutiry.edit().putString(chave, str).apply()
    }

    //recuperando
    fun getString(chave: String): String {
        return secutiry.getString(chave, "") ?: ""

    }
}