package br.ufg.inf.es.construcao.mdc;

/**
 *Implementação de verificação de Máximo Divisor Comum
 */
public class Divisor {

    public static int mdc(int a, int b) {

        if (a < b || b <= 0) {
            throw new IllegalArgumentException("Parametros invalidos");
        }

        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}
