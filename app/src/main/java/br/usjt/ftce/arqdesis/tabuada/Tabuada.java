package br.usjt.ftce.arqdesis.tabuada;

import java.util.ArrayList;

/**
 * Created by asbonato on 02/12/17.
 */

public class Tabuada {

    public static ArrayList<String> calcula(String tab, String fim) {
        int tabuada = Integer.parseInt(tab);
        int ate = Integer.parseInt(fim);
        ArrayList<String> lista = new ArrayList<>();
        String valor = "";
        for (int i = 1; i <= ate; i++) {
            valor = String.format("%d X %d = %d", tabuada, i, tabuada * i);
            lista.add(valor);
        }
        return lista;
    }
}
