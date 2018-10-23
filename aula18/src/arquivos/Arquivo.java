/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo Abreu
 */
public class Arquivo {

    private String caminho;
    private File arquivo;

    public Arquivo(String c) {
        this.caminho = c;
        this.arquivo = new File(caminho);
        try {
            arquivo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List lerArquivo() {
        List<String> lista = new ArrayList<>();
        try {
            FileReader fr = new FileReader(this.caminho);
            BufferedReader bf = new BufferedReader(fr);
            String texto = bf.readLine();
            while (texto != null) {
                lista.add(texto);
                texto = bf.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public void escreverArquivo(String conteudo) {
        try {
            if (arquivo.exists()) {
                FileWriter arquivofw = new FileWriter(caminho, true);
                try (PrintWriter pw = new PrintWriter(arquivofw)) {
                    pw.println(conteudo);
                }

            } else {
                System.out.println("ARQUIVO NAO ENCONTRADO");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void reescreverArquivo(List<String> lista) {
        if (arquivo.exists()) {
            FileWriter arquivofw;
            try {
                arquivofw = new FileWriter(caminho, false);
                try (PrintWriter pw = new PrintWriter(arquivofw)) {
                    pw.print("");
                    for (String c : lista) {
                        escreverArquivo(c);
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("ARQUIVO NAO ENCONTRADO");
        }
    }

}
