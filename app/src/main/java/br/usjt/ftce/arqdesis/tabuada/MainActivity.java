package br.usjt.ftce.arqdesis.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String TABUADA = "br.usjt.ftce.arqdesis.tabuada.tabuada";
    public static final String ATE = "br.usjt.ftce.arqdesis.tabuada.ate";
    EditText tabuada, ate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabuada = (EditText)findViewById(R.id.tabuada);
        ate = (EditText)findViewById(R.id.ate);
    }

    public void calcular(View view) {
        Intent intent = new Intent(this, TabuadaActivity.class);
        intent.putExtra(TABUADA, tabuada.getText().toString());
        intent.putExtra(ATE, ate.getText().toString());
        startActivity(intent);

    }
}
