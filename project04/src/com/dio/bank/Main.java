package com.dio.bank;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Cliente jp = new Cliente();
        jp.setNome("João Pedro");

        Conta cc = new ContaCorrente(jp);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(jp);
        cc.transferir(50, poupanca);

        cc.extrato();
        poupanca.extrato();

        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(cc);
        contas.add(poupanca);

        Banco b = new Banco("JP Bank");
        b.imprimeContas(contas);
    }
}
