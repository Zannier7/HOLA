package com.example.alumfial1.mvp.Interfaces;


public interface FactorialInterface {

    interface View{
        void mostrarResultado(String r);
    }
    interface Presenter{
        void mostrarResultado(String r);
        void Factorial(String n);
    }
    interface Model{
        void Factorial(String n);
    }

}
