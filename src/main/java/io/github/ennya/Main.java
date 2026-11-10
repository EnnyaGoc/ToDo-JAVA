package io.github.ennya;

import java.time.LocalDate;

import io.github.ennya.model.Prioridade;
import io.github.ennya.model.Tarefa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Tarefa tarefa1 = new Tarefa(LocalDate.parse("2026-12-21"), "minha primeira tarefa teste", "Primeira Tarefa", Prioridade.ALTA);

        System.out.println(tarefa1);

    }
}