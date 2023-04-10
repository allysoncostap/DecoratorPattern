package com.pattern;

public class ArCondicionado extends CarroUpgrade implements Adicionais  {
    public ArCondicionado(Carro carro) {
        super(carro);
    }
    public String item() {
        return carro.item() + ", ar condicionado ";
    }

    public double obterValor() {
        return carro.obterValor() + 2000.0;
    }
}
