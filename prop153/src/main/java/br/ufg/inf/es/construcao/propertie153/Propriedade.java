package br.ufg.inf.es.construcao.propertie153;

/**
 * Implementa algoritmo para verificar a existencia da propriedade 153
 * em um dado número n;
 */
public class Propriedade {

    /**
     * verifica a existência da propriedade 153
     * @param n número em que será verificada a existencia da propriedade;
     * @return {@code true} caso o número dado atenda à propriedade;
     *         {@code false} caso contrário;
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
