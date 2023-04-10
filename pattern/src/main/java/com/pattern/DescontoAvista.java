package com.pattern;

public class DescontoAvista extends CarroUpgrade implements Adicionais  {
    public DescontoAvista(Carro carro) {
        super(carro);
    }

    public String item() {
        return carro.item() + ", Desconto";
    }

    public double obterValor() {
        return carro.obterValor() - 1000.0;
    }


}
