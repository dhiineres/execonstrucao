package br.ufg.inf.es.construcao.mdc;

import org.junit.Test;
import org.junit.Assert;

public class DivisorTest {

    @Test (expected = IllegalArgumentException.class)
    public void testAMenorB () throws Exception {
        Divisor.mdc(2, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testBMenorZero () throws Exception {
        Divisor.mdc(5, -3);
    }

    @Test
    public void testCasosdeFronteira () throws Exception {
        Assert.assertEquals(1, Divisor.mdc(5, 3));
        Assert.assertEquals(2, Divisor.mdc(2, 2));
        Assert.assertEquals(50, Divisor.mdc(100, 50));
    }

    @Test
    public void testCasosTriviais () throws Exception {
        Assert.assertEquals(5, Divisor.mdc(25, 15));
        Assert.assertEquals(3, Divisor.mdc(12, 9));
        Assert.assertEquals(10, Divisor.mdc(90, 20));
    }
}
