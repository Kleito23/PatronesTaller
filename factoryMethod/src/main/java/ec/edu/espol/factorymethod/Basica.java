/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author JUAN PEREZ
 */
public class Basica extends TarjetaDeCredito{
    
    public Basica(double costoAnual, int limiteCredito) {
        super(costoAnual, limiteCredito);
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Tarjeta Basica");
        System.out.println("Costo Anual: "+costoAnual);
        System.out.println("Límite de Credito: "+limiteCredito);
    }
}
