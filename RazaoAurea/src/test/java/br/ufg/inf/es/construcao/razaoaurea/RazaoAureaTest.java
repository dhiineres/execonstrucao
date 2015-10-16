package br.ufg.inf.es.construcao.razaoaurea;

import org.junit.*;

public class RazaoAureaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testT1Invalido() throws Exception {
        RazaoAurea.razao(0, 2, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testT2Invalido() throws Exception {
        RazaoAurea.razao(5, 3, 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFatorInvalido() throws Exception {
        RazaoAurea.razao(5, 7, -3);
    }

    @Test
    public void testRazaoAurea() throws Exception {
        Assert.assertEquals(1.61803399d, RazaoAurea.razao(99, 100, 1000), 0.00000001d);
        Assert.assertEquals(1.61803399d, RazaoAurea.razao(13, 100, 20), 0.00000001d);
    }
}
