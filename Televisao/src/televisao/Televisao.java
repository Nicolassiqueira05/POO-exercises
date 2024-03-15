/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package televisao;

public class Televisao {

    public static void main(String[] args) {
        TelevisaoClass tv = new TelevisaoClass("Samsumg", 50, "Smart TV");
        tv.ligar();
        tv.mudarCanal();
        tv.desligar();
    }
    
}
