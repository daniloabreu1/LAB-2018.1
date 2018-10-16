package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Arquivo {

    private Scanner s;

    String arquivoNome() {
        String nome;
        System.out.println("DIGITE O NOME DO ARQUIVO ");
        s = new Scanner(System.in);
        nome = s.next();
		// String caminho
        // ="Home\"+System.getProperty("user.name").toString()+"\Desktop\"+nome+".txt";
        String caminho = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\" + nome + ".txt";
        return caminho;
    }

    void criarArquivo() {
        String caminho = arquivoNome();
        File arquivo = new File(caminho);
        try {
            arquivo.createNewFile();
            System.out.println("arquivo criado..");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void lerArquivo() {
        String caminho = arquivoNome();

        try {
            FileReader fr = new FileReader(caminho);
            BufferedReader bf = new BufferedReader(fr);
            String texto = bf.readLine();
            System.out.println("-----------------");
            System.out.println("INICIO DO ARQUIVO");
            System.out.println("-----------------");
            while (texto != null) {
                System.out.println(texto);
                texto = bf.readLine();
            }
            System.out.println("-----------------");
            System.out.println(" FIM DO ARQUIVO ");
            System.out.println("-----------------");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void escreverArquivo() {

        System.out.println("DIGITE O CONTEUDO A SER ARMAZENADO:");
        s = new Scanner(System.in);
        String conteudo = s.nextLine();
        String caminho = arquivoNome();
        try {
            File arq = new File(caminho);
            if (arq.exists()) {
                FileWriter arquivo = new FileWriter(caminho, true);
                // arquivo.write(conteudo+"\n");
                PrintWriter pw = new PrintWriter(arquivo);
                pw.println(conteudo);
                pw.close();
                System.out.println("ARQUIVO SALVO");
            } else {
                System.out.println("ARQUIVO NAO ENCONTRADO");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    void renomearArquivo() {
        String caminho = arquivoNome();
        try {
            File arquivo = new File(caminho);
            String novoNome = arquivoNome();
            arquivo.renameTo(new File(novoNome));
            System.out.println("arquivo renomeado!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    void removerArquivo() {
        String caminho = arquivoNome();
        File arquivo = new File(caminho);
        try {

            if (arquivo.exists()) {
                FileWriter escritor = new FileWriter(caminho, true);
                // arquivo.write(conteudo+"\n");
                PrintWriter pw = new PrintWriter(escritor);
                pw.println("");
                pw.close();

            } else {
                System.out.println("ARQUIVO NAO ENCONTRADO");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        arquivo.delete();
        if (arquivo.exists()) {
            System.out.println("ARQUIVO NÃO REMOVIDO...");
        } else {
            System.out.println("ARQUIVO REMOVIDO...");
        }

    }

    void dadosArquivo() {
        String caminho = arquivoNome();
        File arquivo = new File(caminho);
        StringBuilder dados = new StringBuilder();
        dados.append("caminho: " + arquivo.getAbsolutePath() + "\n");
        dados.append("Ultima modificacao: " + new Date(arquivo.lastModified()) + "\n");
        dados.append("tamanho: " + arquivo.length() + "\n");
        dados.append("diretorio pai: " + arquivo.getParent() + "\n");
        System.out.println(dados);
    }

    void listar() {
        String caminho = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\";
        File arquivo = new File(caminho);
        File arq[] = arquivo.listFiles();
        for (int i = 0; i < arq.length; i++) {
            System.out.println(arq[i]);

        }
    }

}
