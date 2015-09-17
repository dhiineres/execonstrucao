package br.ufg.inf.es.construcao.propriedade153;

/**
 *Implementação de verificação da propriedade do número 153
 */

public class Propriedade {

    /**
     * verifica a existência da propriedade 153
     * @param n número cuja propriedade será verificada
     * @return {@code true} caso n atenda à propriedade
     *         {@code false} caso contrário
     */
    public static boolean propriedade(int n) {

        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("N deve ser maior que -1 e" +
                    " menor que 1000");
        }

        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;

        return i * i * i + j * j * j + k * k * k == n;

    }

}
