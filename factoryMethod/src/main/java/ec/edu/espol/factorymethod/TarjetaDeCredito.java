/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author DR JUAN PEREZ
 */
public abstract class TarjetaDeCredito {
    public double costoAnual;
    public int limiteCredito;

    public TarjetaDeCredito(double costoAnual, int limiteCredito) {
        this.costoAnual = costoAnual;
        this.limiteCredito = limiteCredito;
    }

    public abstract void imprimirDatos();
}
