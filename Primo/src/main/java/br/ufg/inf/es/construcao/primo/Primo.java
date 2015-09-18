package br.ufg.inf.es.construcao.primo;

/**
 * Implementação de verificação de Primo;
 */
public class Primo {

    /**
     * Verifica Primo
     * @param n número a ser verificado
     * @return {@code true} caso seja primo
     *         {@code false} caso contrário
     */
    public static boolean primo(int n) {
        if (n <= 1){
            throw new IllegalArgumentException("N menor que 1");
        }

        int i = 2;

        while (i <= (n - 1)){
            if (n % i == 0){
                return false;
            }

            i = i + 1;
        }

        return true;
    }
}
