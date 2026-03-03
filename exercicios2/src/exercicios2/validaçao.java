/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios2;

/**
 *
 * @author aluno.saolucas
 */
public class validaçao {
    
   private String Nome;
   private double  preco;
   public void setNome(String Nome){
   this.Nome  =Nome;
   
   
   }
   public  String  getnome(){
       return Nome;
   }
   public void  setPreco(double preco){
       if (preco < 0){
       System.out.println("erro:O preçonao pode ser negativo !");
   }else{    
           this.preco =preco;
           }
   }
   
   public double  getPreco(){
       return preco ;
   }
}
   
   
   