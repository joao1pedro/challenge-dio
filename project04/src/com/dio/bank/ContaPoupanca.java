package com.dio.bank;

public class ContaPoupanca extends Conta{
    final String tipo = "Poupança";

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("==== Extrato Conta Poupança=====");
        super.imprimirInfosComuns();
    }

    @Override
    public String ContaTipo() {
        return this.tipo;
    }
}
