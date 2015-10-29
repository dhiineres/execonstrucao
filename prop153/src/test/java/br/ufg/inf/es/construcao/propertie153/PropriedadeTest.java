package br.ufg.inf.es.construcao.propertie153;

import org.junit.*;

public class PropriedadeTest {

    @Test (expected = IllegalArgumentException.class)
    public void testNMenorZero() throws Exception {
        Propriedade.propriedade(-5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNMaiorMil() throws Exception {
        Propriedade.propriedade(1007);
    }

    @Test
    public void testCasosdeFronteira() throws Exception {
        Assert.assertEquals(true, Propriedade.propriedade(0));
        Assert.assertEquals(true, Propriedade.propriedade(1));
        Assert.assertEquals(false, Propriedade.propriedade(2));
        Assert.assertEquals(false, Propriedade.propriedade(998));
        Assert.assertEquals(false, Propriedade.propriedade(999));
    }

    @Test
    public void testCasosConhecidos() throws Exception {
        Assert.assertEquals(true, Propriedade.propriedade(153));
    }
}
