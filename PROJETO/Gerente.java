package model;

public class Gerente extends Funcionario implements Gerencia {

    public Gerente(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void organizarEquipe() {
    }

    @Override
    public void conduzirReunioes() {
    }

    @Override
    public String mostrarDetalhes() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Salário: " + getSalario() + " | Cargo: Gerente";
    }
}
