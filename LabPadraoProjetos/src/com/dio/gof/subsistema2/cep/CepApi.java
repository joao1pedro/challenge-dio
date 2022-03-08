package com.dio.gof.subsistema2.cep;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
