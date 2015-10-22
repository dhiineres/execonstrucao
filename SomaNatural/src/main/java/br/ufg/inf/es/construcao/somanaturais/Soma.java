package br.ufg.inf.es.construcao.somanaturais;

/**
 * Realiza a somatorio de numeros naturais
 */
public class Soma {

    /**
     * Verifica o somatório;
     * @param n flag de parada da operação;
     * @return somarorio;
     */
    public static int somatorio(int n){
        if (n < 1){
            throw new IllegalArgumentException("N deve ser maior que 0");
        }

        int i = 2, s = 1;
        while (i <= n){
            s = s + i;
            i++;
        }
        return s;
    }
}
