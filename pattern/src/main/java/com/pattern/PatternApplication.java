package com.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternApplication.class, args);



        Carro carro = new CarroBasico();
        carro= new ArCondicionado(carro);
        carro= new BancoDeCouro(carro);
        carro= new DescontoAvista(carro);


        System.out.println(carro.item());
        System.out.println("Valor do carro Avista: R$ " + carro.obterValor() );



    }
}
