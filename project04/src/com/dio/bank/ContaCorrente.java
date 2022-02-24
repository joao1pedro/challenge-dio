package com.dio.bank;

public class ContaCorrente extends Conta{
    final String tipo = "Conta-Corrente";

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("==== Extrato Conta Corrente =====");
        super.imprimirInfosComuns();
    }

    @Override
    public String ContaTipo() {
        return this.tipo;
    }
}
