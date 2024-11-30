/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.factorymethod;

/**
 *
 * @author JUAN PEREZ
 */
public class FactoryMethod {

    public static void main(String[] args) {
        Afiliaciones afilBasica=new AfiliacionBasica();
        Afiliaciones afilPremium=new AfiliacionPremium();
        Afiliaciones afilVIP=new AfiliacionVIP();
        
        
        //Emite una tarjeta basica si el cliente obtiene una tarjeta basica
        TarjetaDeCredito creditoBasico=afilBasica.emitirTarjeta();
        //Emite una tarjeta premium si el cliente obtiene una tarjeta premium
        TarjetaDeCredito creditoPremium=afilPremium.emitirTarjeta();
        //Emite una tarjeta VIP si el cliente obtiene una tarjeta VIP
        TarjetaDeCredito creditoVIP=afilVIP.emitirTarjeta();
        //Todas solo usan emitirTarjeta
        
        
        creditoBasico.imprimirDatos();
        creditoPremium.imprimirDatos();
        creditoVIP.imprimirDatos();
    }
}
