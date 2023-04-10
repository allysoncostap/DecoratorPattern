package com.pattern;

public abstract class CarroUpgrade implements Carro {
    protected  Carro carro;


    public CarroUpgrade(Carro carro){
        this.carro= carro;
    }

    public String getDescription(){
        return carro.item();
    }

    public double getCost(){
        return carro.obterValor();
    }


}
