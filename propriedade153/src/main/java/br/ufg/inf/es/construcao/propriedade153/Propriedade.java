package br.ufg.inf.es.construcao.propriedade153;

public class Propriedade {

    public static boolean propriedade(int n) {

        if (n < 0 || n > 999){
            throw new IllegalArgumentException("N deve ser maior que -1 e menor que 1000");
        }

        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;

        if ( i * i * i + j * j * j + k * k * k == n ) {
            return true;
        }
        else {
            return false;
        }
    }

}
