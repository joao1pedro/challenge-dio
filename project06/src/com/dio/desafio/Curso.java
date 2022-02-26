package com.dio.desafio;

public class Curso extends Conteudo{
    private double cargaHorario;

    public double getCargaHorario() {
        return cargaHorario;
    }
    public void setCargaHorario(double cargaHorario) {
        this.cargaHorario = cargaHorario;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHorario +"]";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorario;
    }
}
