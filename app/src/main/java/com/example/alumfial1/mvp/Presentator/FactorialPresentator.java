package com.example.alumfial1.mvp.Presentator;

import android.util.Log;

import com.example.alumfial1.mvp.Interfaces.FactorialInterface;
import com.example.alumfial1.mvp.Model.FactorialModel;
import com.example.alumfial1.mvp.View.FactorialView;

public class FactorialPresentator implements FactorialInterface.Presenter{

    private FactorialInterface.View view;
    private FactorialInterface.Model model;

    public FactorialPresentator(FactorialView view){
        this.view = view;
        model = new FactorialModel(this);
    }

    @Override
    public void mostrarResultado(String r) {
        if(view!=null){
            view.mostrarResultado(r);
            Log.d("Hola soy r", r);
        }
    }

    @Override
    public void Factorial(String n) {
        if(view!=null){
            model.Factorial(n);
            Log.d("Hola soy n", n);
        }
    }
}
