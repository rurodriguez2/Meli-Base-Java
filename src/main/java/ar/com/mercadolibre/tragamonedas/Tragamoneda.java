package ar.com.mercadolibre.tragamonedas;

import java.util.ArrayList;
import java.util.List;

public class Tragamoneda {

    private Tambor primerTambor;
    private Tambor segundoTambor;
    private Tambor tercerTambor;

    public Tragamoneda (Tambor primerTambor, Tambor segundoTambor, Tambor tercerTambor){
        this.primerTambor = primerTambor;
        this.segundoTambor = segundoTambor;
        this.tercerTambor = tercerTambor;
    }

    public void activar() {
        primerTambor.girar();
        segundoTambor.girar();
        tercerTambor.girar();
    }

    public boolean entregarPremio() {
        System.out.println("Ganaste");
        return primerTambor.getPosicion() == segundoTambor.getPosicion()
                && segundoTambor.getPosicion() == tercerTambor.getPosicion();
    }

}
