/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aliceapp;

/**
 *
 * @author alunolab02
 */
public class AliceClass {
    float tamanho;
    String corCabelo;
    int posX, posY, posZ;
    public AliceClass(float tamanho, String corCabelo, int[] pos){
        this.tamanho = tamanho;
        this.corCabelo = corCabelo;
    }
    public boolean move(){
        System.out.println(posX + "" + posZ + posZ);
        return true;
    }
    public void turn(){
        
    }
    public void say(String texto){
        System.out.println(texto);
    }
}
