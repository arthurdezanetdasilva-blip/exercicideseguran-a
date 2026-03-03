/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainporta;

/**
 *
 * @author aluno.saolucas
 */
class Porta {

    private boolean aberta;

    public void abrir() {
        aberta = true;
        System.out.println("A porta está aberta.");
    }

    public void fechar() {
        aberta = false;
        System.out.println("A porta está fechada.");
    }

    public boolean estaAberta() {
        return aberta;
    }
}
    


