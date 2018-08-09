package banco;

/**
 *
 * @author Danilo Abreu
 */
public class Cliente {
    private static int qtd=0;
    private final int codigo;
    private String nome,rg, cpf;

    public Cliente(String nome) {
        this.nome = nome;
        this.codigo=++qtd;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void alterarNome(String novoNome){
        this.nome= novoNome;
    }
    
    public static int getQuantidade() {
        return qtd;
    }
    
}
