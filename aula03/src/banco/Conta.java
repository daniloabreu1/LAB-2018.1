
package banco;

public class Conta {
    private static int qtd=10000;
    private final int codigo;
    private double saldo, limite;
    private final Cliente cliente;
    private final Agencia agencia;

    public Conta(Cliente cliente, Agencia agencia) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.codigo=++qtd;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public static int getQuantidade() {
        return qtd-10000;
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }
    
}
