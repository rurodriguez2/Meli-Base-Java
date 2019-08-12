package ar.com.mercadolibre.javaoop;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private static Libreria libreria = new Libreria();
    private List<Alquiler> alquileres = new ArrayList<>();

    private Libreria(){}

    private Libreria getInstance() {
        return libreria;
    }
}
