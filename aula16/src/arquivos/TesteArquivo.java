package arquivos;

import java.util.Scanner;

public class TesteArquivo {

	public static void main(String[] args) {
		Arquivo arquivo = new Arquivo();
		Scanner s = new Scanner(System.in);
		int op;
		do {
			System.out.println("-----------------------");
			System.out.println("MANIPULACAO DE ARQUIVOS");
			System.out.println("-----------------------");
			System.out.println("1 - CRIAR");
			System.out.println("2 - ESCREVER");
			System.out.println("3 - LER");
			System.out.println("4 - RENOMEAR");
			System.out.println("5 - REMOVER");
			System.out.println("6 - DADOS DO ARQUIVO");
			System.out.println("7 - LISTAR ARQUIVOS");
			System.out.println("0 - SAIR");
			op = s.nextInt();
			System.out.println("");
			switch (op) {
			case 1:
				arquivo.criarArquivo();
				break;
			case 2:
				arquivo.escreverArquivo();
				break;
			case 3:
				arquivo.lerArquivo();
				break;
			case 4:
				arquivo.renomearArquivo();
				break;
			case 5:
				arquivo.removerArquivo();
				break;
			case 6:
				arquivo.dadosArquivo();
				break;
			case 7:
				arquivo.listar();
				break;
			case 0:
				System.exit(0);

			default:
				System.out.println("OPCAO INVALIDA!");
			}
		} while (true);
	}

}
