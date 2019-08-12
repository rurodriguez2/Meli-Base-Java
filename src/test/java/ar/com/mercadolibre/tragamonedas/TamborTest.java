package ar.com.mercadolibre.tragamonedas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TamborTest {


    @Test
    public void validaPosicionEntre1a8 () {
        Tambor tambor = new Tambor();

        int posicionInicial = tambor.getPosicion();

        Assertions.assertThat(posicionInicial).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(8);
    }

    @Test
    public void validaPosicionLuegoDeGirar () {

        Tambor tambor = new Tambor();

        tambor.girar();

        int posicionInicial = tambor.getPosicion();

        Assertions.assertThat(posicionInicial).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(8);

    }

}
