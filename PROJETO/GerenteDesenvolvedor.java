package model;

public class GerenteDesenvolvedor extends Funcionario implements Desenvolve, Gerencia {

    public GerenteDesenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void codar() {
    }

    @Override
    public void resolverProblemas() {
    }

    @Override
    public void organizarEquipe() {
    }

    @Override
    public void conduzirReunioes() {
    }

    @Override
    public String mostrarDetalhes() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Salário: " + getSalario() + " | Cargo: Gerente Desenvolvedor";
    }
}
