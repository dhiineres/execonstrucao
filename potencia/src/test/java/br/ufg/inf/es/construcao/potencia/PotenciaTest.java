package br.ufg.inf.es.construcao.potencia;

import org.junit.Assert;
import org.junit.Test;


public class PotenciaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Potencia.potencia (0, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Potencia.potencia(1, -1);
    }

    @Test
    public void testCasosDeFronteira () {
        Assert.assertEquals(1, Potencia.potencia(1, 0));
        Assert.assertEquals(1, Potencia.potencia(2, 0));
        Assert.assertEquals(1, Potencia.potencia(1, 100));
        Assert.assertEquals(2, Potencia.potencia(2, 1));
    }

    @Test
    public void TestCasosTriviais () {
        Assert.assertEquals(4, Potencia.potencia(2, 2));
        Assert.assertEquals(9, Potencia.potencia(3, 2));
        Assert.assertEquals(32, Potencia.potencia(2, 5));
        Assert.assertEquals(100, Potencia.potencia(10, 2));
        Assert.assertEquals(25, Potencia.potencia(5, 2));
    }
}
