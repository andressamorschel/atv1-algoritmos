package br.com.atividade1;

import java.util.Scanner;

public class Service {

    public void test() {
        System.out.println("Digite a quantidade de apartamentos:");

        Scanner scan = new Scanner(System.in);
        int quantidadeApartamento = scan.nextInt();

        double maiorQuantidade = 0;
        int indiceMaiorGastoPorAp = 0;
        double[] consumoPorApartamento = new double[quantidadeApartamento];

        for (int i = 0; i < quantidadeApartamento; i++) {
            System.out.println(String.format("Digite o consumo em litros do ap %d", i));
            consumoPorApartamento[i] = scan.nextDouble();
            if (consumoPorApartamento[i] > maiorQuantidade) {
                maiorQuantidade = consumoPorApartamento[i];
                indiceMaiorGastoPorAp = i;
            }
        }
        var consumoEmMetroCubico = calcularMetroCubico(maiorQuantidade);
        System.out.println(String.format("O maior consumo foi de %2f do apartamento %d", consumoEmMetroCubico,
                indiceMaiorGastoPorAp));
    }

    public double calcularMetroCubico(double quantidadeEmLitros) {
        return quantidadeEmLitros / 1000;
    }
}
