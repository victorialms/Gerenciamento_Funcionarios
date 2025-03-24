package model;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Desenvolvedor(1, "Alice", 5000.00));
        funcionarios.add(new Gerente(2, "Carlos", 7000.00));
        funcionarios.add(new Treinador(3, "Bruno", 6000.00));
        funcionarios.add(new GerenteDesenvolvedor(4, "Mariana", 9000.00));

        System.out.println("Lista de Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.mostrarDetalhes());
        }
    }
}
