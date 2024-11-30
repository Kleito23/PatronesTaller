/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author JUAN PEREZ
 */
public class Premium extends TarjetaDeCredito{
    
    public Premium(double costoAnual, int limiteCredito) {
        super(costoAnual, limiteCredito);
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Tarjeta Premium");
        System.out.println("Costo Anual: "+costoAnual);
        System.out.println("Límite de Credito: "+limiteCredito);
    }
    
}
