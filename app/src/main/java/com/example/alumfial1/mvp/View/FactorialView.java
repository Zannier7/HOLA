package com.example.alumfial1.mvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alumfial1.mvp.Interfaces.FactorialInterface;
import com.example.alumfial1.mvp.Presentator.FactorialPresentator;
import com.example.alumfial1.mvp.R;

public class FactorialView extends AppCompatActivity implements FactorialInterface.View{

    private TextView resultado;
    private EditText numero;
    private Button btncalcular;
    private FactorialInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.resultado);
        numero = (EditText)findViewById(R.id.numero);

        presenter = new FactorialPresentator(this);
    }
    public void Calcular(View view){
        presenter.Factorial(numero.getText().toString().trim());
    }

    @Override
    public void mostrarResultado(String r) {
        resultado.setText(r);
    }
}
