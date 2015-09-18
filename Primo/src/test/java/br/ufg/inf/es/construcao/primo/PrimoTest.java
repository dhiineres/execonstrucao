package br.ufg.inf.es.construcao.primo;

import org.junit.Assert;
import org.junit.Test;

public class PrimoTest {
    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Primo.primo(1);
    }

    @Test
    public void testPrimos() throws Exception {
        Assert.assertTrue(Primo.primo(2));
        Assert.assertTrue(Primo.primo(3));
        Assert.assertTrue(Primo.primo(5));
        Assert.assertTrue(Primo.primo(23));
    }

    @Test
    public void testNaoPrimos() throws Exception {
        Assert.assertFalse(Primo.primo(4));
        Assert.assertFalse(Primo.primo(6));
        Assert.assertFalse(Primo.primo(10));
        Assert.assertFalse(Primo.primo(88));
    }
}
