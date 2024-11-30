package ec.edu.espol;

public class EnviableDecorator implements Enviable {

    public Enviable wrapper;

    public EnviableDecorator(Enviable wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void enviar(String mensaje) {
        wrapper.enviar(mensaje);
    }

}
