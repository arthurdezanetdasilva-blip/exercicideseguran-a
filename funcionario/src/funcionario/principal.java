/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author aluno.saolucas
 */
public class principal {
  // Atributos privados
    private String nome;
    private double salario;

    // Método para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome
    public String getNome() {
        return nome;
    }

    // Método para definir o salário
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para obter o salário
    public double getSalario() {
        return salario;
    }
}  

