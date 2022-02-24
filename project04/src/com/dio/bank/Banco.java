package com.dio.bank;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void imprimeContas(List<Conta> contas) {
        for (Conta c : contas) {
            System.out.println("==== Clientes ====");
            System.out.println(String.format("Tipo: %s", c.ContaTipo()));
            System.out.println(c.cliente.getNome());
            System.out.println(c.agencia);
            System.out.println(c.numero);
        }
    }
}