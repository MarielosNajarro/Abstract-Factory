/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author marielos
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFit();
        CarroSedan sedan = fabrica.crearCarroSedan();
        CarroPopular popular = fabrica.crearCarroPopular();
        sedan.exibirInfoSedan();
        System.out.println(" ");
        popular.exibirInfoPopular();
        System.out.println(" ");
        
    }
    
}
