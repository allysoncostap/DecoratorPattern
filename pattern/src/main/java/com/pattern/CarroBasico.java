package com.pattern;

public class CarroBasico implements Carro {


    @Override
    public String item() {
        return "kit basico";
    }

    @Override
    public double obterValor() {
        return 10000.0;
    }
}
