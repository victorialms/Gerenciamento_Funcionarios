package model;

public class Desenvolvedor extends Funcionario implements Desenvolve {

    public Desenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void codar() {
    }

    @Override
    public void resolverProblemas() {
    }

    @Override
    public String mostrarDetalhes() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Salário: " + getSalario() + " | Cargo: Desenvolvedor";
    }
}
