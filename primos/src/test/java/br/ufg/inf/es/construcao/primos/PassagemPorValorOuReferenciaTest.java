package br.ufg.inf.es.construcao.primos;

import junit.framework.Assert;
import org.junit.Test;

public class PassagemPorValorOuReferenciaTest {

    @Test
    public void testAlteracaoEmVetorVisivelExternamente() {
        int[] x = { 1, 2 };
        PassagemPorValorOuReferencia.addUm(x);
        Assert.assertEquals(2, x[0]);
        Assert.assertEquals(3, x[1]);
    }

    @Test
    public void testPassagemVetor() {
        int[] x = { 1, 2 };
        int[] y = PassagemPorValorOuReferencia.oProprio(x);
        Assert.assertEquals(x, y);

        Assert.assertEquals(y[0], x[0]);

        x[0] = 4;
        Assert.assertEquals(4, y[0]);
    }

    @Test
    public void testPassagemPorValor() {
        int x = 10;
        x = PassagemPorValorOuReferencia.acrescentaUm(x);
        Assert.assertEquals(11, x);
    }
}