package br.usjt.ftce.arqdesis.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TabuadaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);
        Intent intent = getIntent();
        String tabuada = intent.getStringExtra(MainActivity.TABUADA);
        String ate = intent.getStringExtra(MainActivity.ATE);
        ArrayList<String> lista = Tabuada.calcula(tabuada, ate);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView)findViewById(R.id.tabuada);
        listView.setAdapter(adapter);
    }
}
