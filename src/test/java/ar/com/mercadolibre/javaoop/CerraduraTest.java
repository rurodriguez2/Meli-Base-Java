package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CerraduraTest {

    @Test
    public void crearCerradura(){
        Cerradura cerradura = new Cerradura();
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClave(){
        Cerradura cerradura = new Cerradura("Example123");
        Assertions.assertThat(cerradura.getClave()).isNotNull();
    }

}
