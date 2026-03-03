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
public class Funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Criando objeto da classe Funcionario
        Funcionario funcionario = new Funcionario();

        // Definindo valores
        funcionario.setNome("Maria Souza");
        funcionario.setSalario(4500.00);

        // Exibindo os dados
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: R$ " + funcionario.getSalario());
    }

    private void setNome(String maria_Souza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSalario(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
    

