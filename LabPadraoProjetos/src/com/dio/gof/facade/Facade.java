package com.dio.gof.facade;

import com.dio.gof.subsistema1.crm.CrmService;
import com.dio.gof.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
