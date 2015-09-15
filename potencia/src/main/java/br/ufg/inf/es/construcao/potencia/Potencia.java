package br.ufg.inf.es.construcao.potencia;

/**
 * Implementação de algoritmo que calcula a potencia de um número x em um
 * expoente y, utilizando apenas multiplicações simples;
 */
public class Potencia {


    public static int potencia(int x, int y) {

        if (x <= 0 || y < 0) {
            throw new IllegalArgumentException("x ou y invalido");
        }

        int i = 1;
        int p = 1;
        while ( i <= y) {
            p = p * x;
            i = i + 1;
        }

        return p;
    }
}