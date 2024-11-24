package model;

public class Treinador extends Funcionario implements Treina {

    public Treinador(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void ensinarTecnologia() {
    }

    @Override
    public void motivarEquipe() {
    }

    @Override
    public String mostrarDetalhes() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Salário: " + getSalario() + " | Cargo: Treinador";
    }
}
