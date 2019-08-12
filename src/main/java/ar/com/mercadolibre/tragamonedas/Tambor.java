package ar.com.mercadolibre.tragamonedas;


public class Tambor {

    private int posicion = obtenerNumeroAleatorio();

    private int obtenerNumeroAleatorio() {
        return (int) (Math.random() * 8 + 1);
    }

    public int getPosicion() {
        return posicion;
    }

    public void girar() {
        posicion = obtenerNumeroAleatorio();
    }
}
