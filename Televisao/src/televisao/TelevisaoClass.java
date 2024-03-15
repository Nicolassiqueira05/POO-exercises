/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package televisao;

/**
 *
 * @author alunolab02
 */
public class TelevisaoClass {
    String marca;
    int tamanho;
    String tipo;
    
    public TelevisaoClass(String marca, int tamanho, String tipo){
        this.marca = marca;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
    
    public void ligar(){
        System.out.println("Ligou");
    }
    public void desligar(){
        System.out.println("Desligou");
    }
    public void mudarCanal(){
        System.out.println("trocou o canal");
    }
}
