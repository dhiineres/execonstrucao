package br.ufg.inf.es.construcao.primos;

public class PassagemPorValorOuReferencia {
    public static int acrescentaUm(int i) {
        return i + 1;
    }

    public static int[] oProprio(int[] x) {
        return x;
    }

    public static void addUm(int[] x) {
        x = new int[] { 1, 2 };
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] + 1;
        }
    }
}
