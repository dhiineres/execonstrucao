package br.ufg.inf.es.construcao.data;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;
import org.junit.Assert;

public class DataTest {

    @Test (expected = IllegalArgumentException.class)
    public void testAnostandMenor() throws Exception {
        Data.semana(2, 6, 1997, 5, 4, 1996, 4, 4);
    }


    @Test (expected = IllegalArgumentException.class)
    public void testMesstandMenor() throws Exception {
        Data.semana(2, 6, 1997, 2, 5, 1997, 4, 4);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDiastandMenor() throws Exception {
        Data.semana(2, 6, 1997, 1, 6, 1997, 4, 4);
    }

    @Test
    public void testmenos1() throws Exception {
        Assert.assertEquals(-1, Data.semana(31, 2, 2015, 25, 6, 2015, 4, 4));
        Assert.assertEquals(-1, Data.semana(-29, 2, 2015, 25, 6, 2015, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, -2, 2015, 25, 6, 2015, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, 25, 2014, 25, 6, 2015, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, 2, -6, 25, 6, 2015, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, 3, 2015, 31, 6, 2016, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, 3, 2015, -2, 6, 2016, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, 3, 2015, 31, 6, 2016, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, 3, 2015, 31, 15, 2016, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, 3, 2015, 31, -6, 2016, 4, 4));
        Assert.assertEquals(-1, Data.semana(29, 3, 2015, 31, 7, 2016, -1, 4));
        Assert.assertEquals(-1, Data.semana(29, 3, 2015, 31, 7, 2016, 7, 4));
        Assert.assertEquals(-1, Data.semana(29, 3, 2015, 31, 7, 2016, 6, -4));
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(0, Data.semana(2, 6, 1997, 11, 9, 2015, 4, 4));
        Assert.assertEquals(3, Data.semana(10, 9, 2015, 11, 9, 2015, 4, 4));
    }
}