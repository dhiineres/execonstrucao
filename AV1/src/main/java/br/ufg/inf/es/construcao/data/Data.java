package br.ufg.inf.es.construcao.data;

public class Data {

    /**
     *Obtem o dia da semana de uma determinada data, com base em uma data
     * controle estabelecia pelo usuario.
     *
     * @param infod O dia da data de busca.
     * @param infom O mes da data de busca.
     * @param infoa O ano da data de busca.
     * @param standd O dia da data controle.
     * @param standm O mes da data controle.
     * @param standa O ano da data controle.
     * @param stands O dia da semana da data controle.
     * @param bisp Um ano bissexto padrao.
     *
     * @return O valor 0 para segunda-feira, 1 para terça, e sucessivamente.
     *          O valor -1 caso haja algum erro nas datas.
     *
     * @throws IllegalArgumentException Caso a data de busca seja maior que a
     *          data controle.
     */
    public static int semana (int infod, int infom, int infoa, int standd,
                              int standm, int standa, int stands, int bisp){
        int infos, d0, d1, m0, m1, a0, a1, contd, da, dd, bis,
                flag=0, flagmd, rest;

        if ((standa < infoa) || (standa == infoa && standm < infom) ||
                (standa == infoa && standm == infom && standd < infod)) {
            throw new IllegalArgumentException("Data de busca deve ser menor" +
                    " que a data controle");

        }

        d0 = infod;
        m0 = infom;
        a0 = infoa;
        d1 = standd;
        m1 = standm;
        a1 = standa;
        flagmd = 0;
        da = d0;

        switch (m0) {
            case 12 : da = da + 30;
            case 11 : da = da + 31;
            case 10 : da = da + 30;
            case 9  : da = da + 31;
            case 8  : da = da + 31;
            case 7  : da = da + 30;
            case 6  : da = da + 31;
            case 5  : da = da + 30;
            case 4  : da = da + 31;
            case 3  : da = da + 28;
            case 2  : da = da + 31;
                break;
        }

        dd = 365 - d1;
        switch (m1) {
            case 12 : dd = dd - 30;
            case 11 : dd = dd - 31;
            case 10 : dd = dd - 30;
            case 9 : dd = dd - 31;
            case 8 : dd = dd - 31;
            case 7 : dd = dd - 30;
            case 6 : dd = dd - 31;
            case 5 : dd = dd - 30;
            case 4 : dd = dd - 31;
            case 3 : dd = dd - 28;
            case 2 : dd = dd - 31;
                break;
        }

        contd = (a1 - a0 + 1) * 365 - (dd + da);
        //testes do bissexto
        if ((a0 - bisp) % 4 == 0)
        {
            bis = a0;
            if(m0 <= 2 && ( bis < a1 || (bis == a1 && m1 > 2)))
                contd++;
        }
        else if ((a0 + 1 - bisp) % 4 == 0)
        {
            bis = a0 + 1;
            if (bis < a1 || (bis == a1 && m1 > 2))
                contd++;
        }
        else if (( a0 + 2 - bisp) % 4 == 0)
        {
            bis=a0 + 2;
            if (bis < a1 || (bis == a1 && m1 > 2))
                contd++;
        }
        else
        {
            bis = a0 + 3;
            if (bis < a1 || (bis == a1 && m1 > 2))
                contd++;
        }

        bis = bis + 4;
        while (bis < a1)
        {
            contd++;
            bis = bis + 4;
        }

        if (bis == a1 && ((m1 > 2) || (m1 == 2 && d1 == 29)))
            contd++;

        rest=contd%7;

        if (flagmd == 0)
        {
            infos = stands - rest;
            if (infos > 6)
                infos = infos - 7;
        }
        else
        {
            infos = stands + rest;
            if (infos < 0)
                infos = infos + 7;
        }


        // testes do dia -1
        if (infom == 2 && ( infoa - bisp) % 4 == 0)
            if (infod < 1 || infod > 29)
                flag = 1;
        if (infom == 2 && ( infoa - bisp) % 4 != 0)
            if (infod < 1 || infod > 28)
                flag = 1;
        if (standm == 2 && (standa - bisp) % 4 == 0)
            if (standd < 1 || standd > 29)
                flag = 1;
        if (standm == 2 && (standa - bisp) % 4 != 0)
            if (standd < 1 || standd > 28)
                flag = 1;
        if (infom == 1 || infom == 3 || infom == 5 || infom == 7 || infom == 8 || infom == 10 || infom == 12)
            if (infod < 1 || infod > 31)
                flag = 1;
        if (infom == 4 || infom == 6 || infom == 9 || infom == 11)
            if (infod < 1 || infod > 30)
                flag = 1;
        if (standm == 1 || standm == 3 || standm == 5 || standm == 7 || standm == 8 || standm == 10 || standm == 12)
            if (standd < 1 || standd > 31)
                flag=1;
        if (standm == 4 || standm == 6 || standm == 9 || standm == 11)
            if (standd < 1 || standd > 30)
                flag = 1;

        if (stands > 6 || stands < 0 || bisp < 0 || m0 < 1 || m0 > 12 || m1 < 1 || m1 > 12)
            flag = 1;

        if (flag==1)
            infos = -1;

        return infos;
    }
}
