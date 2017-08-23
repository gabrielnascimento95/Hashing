/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.util.Random;
import hashing.Funcoes;

/**
 *
 * @author 12265041670
 */
public class Hashing {

    /**
     * @param args the command line arguments
     */
    public int calculaHashDivisao(int num, int tam) {
        int pos;
        if (ehPrimo(num)) {
            pos = num % tam;
        } else {
            int p = 100;
            while (p < 200) { // procura o numero primo mais proximo de tam no intervalo de 100-200
                if (ehPrimo(p)) {
                    break;
                } else {
                    p++;
                }
            }
            pos = (num % p) % tam;
        }
        return pos;
    }

    private boolean ehPrimo(int x) {
        int aux = (int) (x / 2);
        for (int y = 2; y < aux; y++) {
            if (x % y == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashMultiplicaçao(int num, int tam) {
        float a = (float) 0.61803399;
        int pos = (int) Math.floor(tam * (num * a - Math.floor(num * a)));
        return pos;
    }

    public static int[] enlacamentoDeslocado(int cod[]) {
        int pos = 0, a = 0, b = 3, c = 6;
        int[] part1 = new int[3];
        int[] part2 = new int[3];
        int[] part3 = new int[3];

        while (a < 3) {
            part1[a] = cod[a];
            a++;
        }
        while (b < 6) {
            part2[b] = cod[b];
            b++;
        }
        while (c < 9) {
            part3[c] = cod[c];
            c++;
        }

        return part1;
    }

    public static void main(String[] args) {
        int[] tabela = new int[100];
        Random gerador = new Random();
        int[] bd = new int[9];

        int i = 0, j = 0, k = 0;

        while (i < tabela.length) {
            int aux = gerador.nextInt(200);
            tabela[i] = aux;
            i++;
        }

        while (k < 9) {
            int aux = gerador.nextInt(9);
            bd[k] = aux;
            k++;
        }

        while (j < 9) {
            System.out.print(bd[j] + " ");
            j++;
        }

        int[] res = new int[3];
        //res = enlacamentoDeslocado(bd);
        j = 0;

        while (j < 3) {
            System.out.print(res[j] + " ");
            j++;
        }
    }

}
