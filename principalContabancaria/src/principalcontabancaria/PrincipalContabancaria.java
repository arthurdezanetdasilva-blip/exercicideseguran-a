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
public class PrincipalContabancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   ContaBancaria conta = new ContaBancaria();

        conta.titular = "João Silva";

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(800); // Tentativa com saldo insuficiente

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
} 
    

