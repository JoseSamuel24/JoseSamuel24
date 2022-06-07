// Alunos:      Guilherme Augusto Maciel de Souza
// 				Jos� Samuel da Silva

import java.util.Locale;
import java.util.Scanner;

public class ListaAtividadeDupla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int questao;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Informa qual quest�o deseja desenvolver: ");
			System.out.println("");
			System.out.println("1 - C�lculo Tri�ngulo, circulo, quadrado, ret�ngulo, trap�io ");
			System.out.println("2 - Ler duas Pe�as e Calcular o valor total da Nota ");
			System.out.println("3 - DIFERENCA = (A * B - C * D). ");
			System.out.println("4 - C�lculo de Almo�o");
			System.out.println("5 - Compra de Bolsa");
			System.out.println("0 - Sair");

			questao = sc.nextInt();

			if (questao == 0) {
				System.out.println("\nAt� Logo!");
				sc.close();
			}

			switch (questao) {
			case 1:

				float A, B, C;
				double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

				System.out.print("Digite o valor de A: ");
				A = sc.nextFloat();

				System.out.print("Digite o valor de B: ");
				B = sc.nextFloat();

				System.out.print("Digite o valor de C: ");
				C = sc.nextFloat();

				areaTriangulo = (A * C) / 2;
				areaCirculo = Math.PI * C * C;
				areaTrapezio = (A + B) / 2 * C;
				areaQuadrado = B * B;
				areaRetangulo = A * B;

				System.out.println("A �rea do tri�ngulo ret�ngulo �: " + areaTriangulo);
				System.out.println("A �rea do circulo � de: " + areaCirculo);
				System.out.println("A �rea do trap�zio � de: " + areaTrapezio);
				System.out.println("A �rea do quadrado � de: " + areaQuadrado);
				System.out.println("A �rea do ret�ngulo � de: " + areaRetangulo);

				break;
			case 2:

				int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
				double valorUnitarioPeca1, valorUnitarioPeca2, valorPagoPeca1, valorPagoPeca2, valorTotalPago;

				System.out.print("Digite o c�digo da pe�a 1: ");
				codigoPeca1 = sc.nextInt();

				System.out.print("Digite o c�digo da pe�a 2: ");
				codigoPeca2 = sc.nextInt();

				System.out.print("Digite a quantidade a ser comprada da pe�a 1: ");
				quantidadePeca1 = sc.nextInt();

				System.out.print("Digite a quantidade a ser comprada da pe�a 2: ");
				quantidadePeca2 = sc.nextInt();

				System.out.print("Digite o valor unit�rio da pe�a 1: ");
				valorUnitarioPeca1 = sc.nextDouble();

				System.out.print("Digite o valor unit�rio da pe�a 2: ");
				valorUnitarioPeca2 = sc.nextDouble();

				valorPagoPeca1 = quantidadePeca1 * valorUnitarioPeca1;
				valorPagoPeca2 = quantidadePeca2 * valorUnitarioPeca2;
				valorTotalPago = valorPagoPeca1 + valorPagoPeca2;

				System.out.println("O valor a ser pago do c�digo " + codigoPeca1 + " � de R$: " + valorPagoPeca1);
				System.out.println("O valor a ser pago do c�digo " + codigoPeca2 + " � de R$: " + valorPagoPeca2);
				System.out.println("O valor total a ser pago � R$: " + valorTotalPago);

				break;
			case 3:

				int valorA, valorB, valorC, valorD, diferenca;

				System.out.print("Digite o valor A: ");
				valorA = sc.nextInt();

				System.out.print("Digite o valor B: ");
				valorB = sc.nextInt();

				System.out.print("Digite o valor C: ");
				valorC = sc.nextInt();

				System.out.print("Digite o valor D: ");
				valorD = sc.nextInt();

				diferenca = (valorA * valorB - valorC * valorD);

				System.out.println("A diferen�a do produto � de: " + diferenca);

				break;
			case 4:

				double valorQuilo = 23.00, pesoPrato = 0.500, pesoComidaCliente, valorTotalPagoCliente;

				System.out.print("Digite o peso da comida em quilos: ");
				pesoComidaCliente = sc.nextDouble();

				valorTotalPagoCliente = (pesoComidaCliente - pesoPrato) * valorQuilo;

				System.out.println("o valor total a ser pago pelo cliente � de R$: " + valorTotalPagoCliente
						+ " ,lembrando que foi retirado o peso prato de: " + pesoPrato);

				break;
			case 5:

				double valorBolsa, desconto10 = 0.10, juros5 = 0.05;
				double pagamentoVista, pagamentoDivididoDezVezes;

				System.out.print("Digite o valor Bolsa a ser comprada R$: ");
				valorBolsa = sc.nextDouble();

				pagamentoVista = valorBolsa - (valorBolsa * desconto10);
				pagamentoDivididoDezVezes = valorBolsa + (valorBolsa * juros5);

				System.out.println(
						"O valor a ser pago por Dona Maria com o pagamento a Vista � de R$: " + pagamentoVista);
				System.out.println(
						"O valor a ser pago por Dona Marina com o pagamento parcelado em 1 ou 2 vezes � de R$: "
								+ valorBolsa);
				System.out.println("O valor a ser pago por Dona Maria com o pagamento dividido me 10 vezes � de R$: "
						+ pagamentoDivididoDezVezes);
				break;
			}
		} while (questao != 0);
		sc.close();
	}
}