package com.dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O Robô está se movendo Agressivamente");
    }
}
