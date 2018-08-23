package banco;

public class Conta {

    private static int qtd = 10000;
    private final int codigo;
    private double saldo, limiteAtual, limiteConta;
    private final Cliente cliente;
    private final Agencia agencia;

    public Conta(Cliente cliente, Agencia agencia, double limite) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.codigo = ++qtd;
        this.limiteConta = limite;
        this.limiteAtual = limite;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public boolean setLimiteConta(double limiteConta) {
        boolean b = false;
        if (getLimiteAtual() == getLimiteConta()) {
            if (getLimiteConta() < limiteConta) {
                this.limiteConta = limiteConta;
                this.limiteAtual=limiteConta;
                b = true;
            }
        }
        return b;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoLimite() {
        return this.getSaldo() + this.getLimiteAtual();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteAtual() {
        return limiteAtual;
    }

    private void setLimiteAtual(double limiteAtual) {
        this.limiteAtual = limiteAtual;
    }

    public static int getQuantidade() {
        return qtd - 10000;
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

    @Override
    public String toString() {
        return "Numero da conta:" + codigo  + "\nNumero da agencia: " + agencia + "\nCliente: " + cliente;
    }

    public boolean saqueConta(double valor) {
        boolean b = false;
        if (valor <= getSaldoLimite()) {
            if (valor <= getSaldo()) {
                setSaldo(getSaldo() - valor);
            } else {
                setLimiteAtual(getLimiteAtual() - (valor - getSaldo()));
                setSaldo(0);
            }
            b = true;
        }
        return b;
    }

    public void depositarValor(double valor) {
        if (getLimiteAtual() == getLimiteConta()) {
            setSaldo(getSaldo() + valor);
        } else {
            if (valor + getLimiteAtual() > getLimiteConta()) {
                setSaldo(valor + getLimiteAtual() - getLimiteConta());
                setLimiteAtual(getLimiteConta());
            } else {
                setLimiteAtual(getLimiteAtual() + valor);
            }
        }
    }
    public double valorDivida(){
        double b=0;
        if(getLimiteAtual()<getLimiteConta()){
            b=getLimiteAtual()-getLimiteConta();
        }
        return b;
    }
}
