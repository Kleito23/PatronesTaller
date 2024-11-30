/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.factorymethod;

/**
 *
 * @author JUAN PEREZ
 */
public class AfiliacionPremium extends Afiliaciones{
    @Override
    public TarjetaDeCredito emitirTarjeta(){
        return new Premium(500,5000);
    }
}
