package br.ufg.inf.es.construcao.razaoaurea;

/**
 *Implementação de algoritmo para verificação da Razão Aurea;
 */
public class RazaoAurea {

    /**
     * Verifica Razão Aurea;
     * @param t1 Valor de verificação (maior que zero);
     * @param t2 Valor de verificação (maior que t1);
     * @param fat fator de precisão (maior que zero);
     * @return razão aurea;
     */

    public static double razao(int t1, int t2, int fat){
        if (t1 <= 0){
            throw new IllegalArgumentException("t1");
        }

        if (t2 <= t1){
            throw new IllegalArgumentException("t2");
        }

        if (fat <= 0){
            throw new IllegalArgumentException("fator");
        }

        double tc = t2; //termo corrente;
        double ta = t1; //termo anterior;
        int i = 1;

        while (i <= fat){
            tc = tc + ta;
            ta = tc - ta;
            i ++;
        }

        return tc/ta;
    }
}
