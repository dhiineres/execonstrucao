package br.ufg.inf.es.construcao.propriedade153;

import org.junit.Test;
import org.junit.Assert;


public class PropriedadeTest {
    @Test (expected = IllegalArgumentException.class)
    public void testParametroAbaixoLimite() throws Exception {
        Propriedade.propriedade(-1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testParametroAcimaLimite() throws Exception {
        Propriedade.propriedade(1000);
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
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(true, Propriedade.propriedade(153));
    }
}
