package com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo java");
        curso1.setCargaHorario(56);
        // System.out.println(curso1.toString());
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprendendo JS");
        curso2.setCargaHorario(40);

        Mentoria ment = new Mentoria();
        ment.setTitulo("Mentoria de Java");
        ment.setDescricao("Mentoria de linguagem Java");
        ment.setDate(LocalDate.now());
        // System.out.println(ment.toString());

        Bootcamp bc = new Bootcamp();
        bc.setNome("Bootcamp Java Developer");
        bc.setDescricao("Bootcamp Java Developer DIO");
        bc.getConteudos().add(curso1);
        bc.getConteudos().add(curso2);
        bc.getConteudos().add(ment);
        
        System.out.println("===========================");
        Developer dev1 = new Developer();
        dev1.setNome("João Pedro");
        dev1.inscreverBootcamp(bc);
        System.out.println("Conteúdos incritos" + dev1.getConteudosInscritos());
        System.out.println("-");
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos incritos" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("===========================");

        System.out.println("===========================");
        Developer dev2 = new Developer();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bc);
        System.out.println("Conteúdos incritos" + dev2.getConteudosInscritos());
        System.out.println("-");
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos incritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("===========================");

    }
}
