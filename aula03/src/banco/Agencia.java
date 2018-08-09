package banco;

/**
 *
 * @author Danilo Abreu
 */
public class Agencia {
    private static int qtd=1000;
    private String nome,cidade, uf;
    private final int numero;

    public Agencia(String nome) {
        this.nome = nome;
        this.numero=++qtd;
    }

    public String getNome() {
        return nome;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public static int getQuantidade() {
        return qtd-1000;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Agencia{" + "nome=" + nome + ", cidade=" + cidade + ", uf=" + uf + ", numero=" + numero + '}';
    }
    
    
}
