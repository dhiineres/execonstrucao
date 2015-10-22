package br.ufg.inf.es.construcao.somanaturais;

import org.junit.*;

public class SomaTest {
    @Test (expected = IllegalArgumentException.class)
    public void testNInvalido() throws Exception {
        Soma.somatorio(0);
    }

    @Test
    public void testSomatorio() throws Exception {
        Assert.assertEquals(21, Soma.somatorio(6));
        Assert.assertEquals(1, Soma.somatorio(1));
        Assert.assertEquals(3, Soma.somatorio(2));
        Assert.assertEquals(6, Soma.somatorio(3));
        Assert.assertEquals(15, Soma.somatorio(5));
    }
}


