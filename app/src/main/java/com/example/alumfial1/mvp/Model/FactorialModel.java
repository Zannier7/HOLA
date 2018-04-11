package com.example.alumfial1.mvp.Model;

import android.util.Log;

import com.example.alumfial1.mvp.Interfaces.FactorialInterface;

public class FactorialModel implements FactorialInterface.Model {

    private FactorialInterface.Presenter presenter;
    private double resultado;

    public FactorialModel(FactorialInterface.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void Factorial(String n) {
        int num = 1;
        int na = Integer.parseInt(n);
        for (int i=2;i <=na;i++ )
            num = num * i;
        resultado = num ;
        presenter.mostrarResultado(String.valueOf(resultado));
        Log.d("Hola soy r", n);
    }
}
