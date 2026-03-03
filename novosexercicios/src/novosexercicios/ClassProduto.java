/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novosexercicios;

/**
 *
 * @author aluno.saolucas
 */
public class ClassProduto {
    // atributos privados
    
    private String nome;
    private double Preco;
    
    //definir nome
    public String setNome(String nome){
        return nome;
    }
        // metodo definir preço
        public void setPreco(double Preco){
         this.Preco=  Preco;   
         
        }
        // metodo para obter preco
        public double getPreco(){
            return Preco;
        }
    }
    

