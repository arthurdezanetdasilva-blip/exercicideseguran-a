/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalcontabancaria;

/**
 *
 * @author aluno.saolucas
 */
public class ClassConta {
    // Atributo público
    public String titular;

    // Atributo privado
    private double saldo;

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Valor de depósito inválido.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }
}
    
    

