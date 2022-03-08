package com.dio.gof;

import com.dio.gof.facade.Facade;
import com.dio.gof.singleton.SingletonEager;
import com.dio.gof.singleton.SingletonLazy;
import com.dio.gof.singleton.SingletonLazyHolder;
import com.dio.gof.strategy.Comportamento;
import com.dio.gof.strategy.ComportamentoAgressivo;
import com.dio.gof.strategy.ComportamentoDefensivo;
import com.dio.gof.strategy.ComportamentoNormal;
import com.dio.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("João Pedro", "140801777");
    }
}
