package com.test.departransp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class firstLayout extends AppCompatActivity {
    Spinner lista;
    String[] departamentos = {"Escoja su opcion","Boaco","Carazo","Chinandega","Chontales","Esteli","Granada","Jinotega","Leon","Madriz","Managua","Masaya","Matagalpa","Nueva Segovia","Region Atlantico Norte","Region Atlantico Sur","Rio San Juan","Rivas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layout);
        lista = (Spinner) findViewById(R.id.spDepart);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,departamentos);
        lista.setAdapter(adaptador);
    }
}
