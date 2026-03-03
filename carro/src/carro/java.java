/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author aluno.saolucas
 */
public class java {

    private static class Veiculo {

        public Veiculo() {
        }
    }
  public class Carro extends Veiculo {

        private int velocidadeMaxima;

    // Método para definir a velocidade máxima
    public void setVelocidadeMaxima(int velocidade) {
        this.velocidadeMaxima = velocidade;
    }

    // Método para exibir a velocidade máxima
    public void exibirVelocidadeMaxima() {
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
    }
    }  
}
