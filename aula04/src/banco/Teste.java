package banco;

import java.util.Scanner;

/**
 *
 * @author Danilo Abreu
 */
public class Teste {

    static int menu() {
        Scanner s = new Scanner(System.in);
        int o = 0;
        System.out.println("1 - DETALHES DA CONTA");
        System.out.println("2 - PARA SALDO");
        System.out.println("3 - PARA SAQUE");
        System.out.println("4 - PARA DEPOSITO");
        System.out.println("5 - PARA AUMENTAR LIMITE");
        System.out.println("0 - PARA SAIR");
        System.out.print("OPCAO >>> ");
        o=s.nextInt();
        return o;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente("Maria José");
        c.setCpf("000.111.222-33");
        c.setRg("87654321");

        Agencia a = new Agencia("Agencia UEPB");
        a.setCidade("Cammpina Grande");
        a.setUf("PB");

        Conta conta = new Conta(c, a, 50);
        int i;
        while ((i = menu()) != 0) {
            Scanner s = new Scanner(System.in);
            System.out.println("");
            switch (i) {
                case 1: 
                    System.out.println(conta.toString());
                case 2: {                   
                    System.out.println("SALDO: "+conta.getSaldo());
                    System.out.println("LIMITE: "+conta.getLimiteAtual());
                    System.out.println("SALDO+LIMITE: "+conta.getSaldoLimite());
                    if(conta.valorDivida()<0){
                        System.out.println("SALDO DEVEDOR: "+conta.valorDivida());
                    }
                    break;
                }
                case 3:{
                    System.out.print("VALOR DO SAQUE >>> ");
                    double v = s.nextDouble();
                    if (conta.saqueConta(v)) {
                        System.out.println("SAQUE REALIZADO");
                    } else {
                        System.out.println("SAQUE NAO REALIZADO");
                    }
                    break;
                }
                case 4:{
                    System.out.print("VALOR DO DEPOSITO >>> ");
                    double v = s.nextDouble();
                    conta.depositarValor(v);
                    System.out.println("DEPOSITO REALIZADO");
                    break;
                }
                case 5:{
                    System.out.print("NOVO LIMITE >>> ");
                    double v = s.nextDouble();
                    if(conta.setLimiteConta(v)){
                        System.out.println("LIMITE ATUALIZADO");    
                    }else{
                        System.out.println("NAO FOI POSSIVEL ATUALIZAR LIMITE");
                    }                  
                    break;
                }
                default:
                    System.out.println("OPCAO INVALIDA");
            }
            System.out.println("");
        }
    }

}
