/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainusuario;

/**
 *
 * @author aluno.saolucas
 */
public class Mainusuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Usuario usuario = new Usuario("admin", "1234");

        if (usuario.autenticar("admin", "1234")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos.");
        }
    }
} 
    

