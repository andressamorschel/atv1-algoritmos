package br.com.atividade1;

import java.util.Arrays;
import java.util.Scanner;

public class Service {
    public void test() {
        System.out.println("Digite a quantidade de apartamentos:");

        Scanner scan = new Scanner(System.in);
        int maiorQuantidade = 0;
        int indiceMaiorQuantidade = 0;
        int quantidadeApartamento = scan.nextInt();

        int[] consumoPorApartamento = new int[quantidadeApartamento];

        for (int i = 0; i < quantidadeApartamento; i++) {
            System.out.println(String.format("Digite o consumo em litros do ap %d", i));
            consumoPorApartamento[i] = scan.nextInt();
            if(consumoPorApartamento[i] > maiorQuantidade){
                maiorQuantidade = consumoPorApartamento[i];
                indiceMaiorQuantidade = consumoPorApartamento[i];
            }
        }
        System.out.println(Arrays.toString(consumoPorApartamento));
        System.out.println(indiceMaiorQuantidade);

    }
}
