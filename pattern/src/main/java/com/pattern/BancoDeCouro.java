package com.pattern;

public class BancoDeCouro extends CarroUpgrade implements Adicionais {
    public BancoDeCouro(Carro carro) {
        super(carro);
    }

    public String item() {
        return carro.item() + ", Banco de Couro";
    }

    public double obterValor() {
        return carro.obterValor() + 3000.0;
    }

}
