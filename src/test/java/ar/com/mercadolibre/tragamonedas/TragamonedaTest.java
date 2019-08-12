package ar.com.mercadolibre.tragamonedas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TragamonedaTest {

    @Test
    public void validarIgualdadEnTamboresYEntreguePremio () {

        Tambor tamborUno = mock(Tambor.class);
        Tambor tamborDos = mock(Tambor.class);
        Tambor tamborTres = mock(Tambor.class);

        when(tamborUno.getPosicion()).thenReturn(3);
        when(tamborDos.getPosicion()).thenReturn(3);
        when(tamborTres.getPosicion()).thenReturn(3);

        Tragamoneda tragamoneda = new Tragamoneda(tamborUno, tamborDos, tamborTres);

        tragamoneda.activar();

        Assertions.assertThat(tragamoneda.entregarPremio()).isTrue();
    }

}
