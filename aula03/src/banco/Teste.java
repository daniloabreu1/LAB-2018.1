package banco;

/**
 *
 * @author Danilo Abreu
 */
public class Teste {
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente("Maria José");
        c.setCpf("000.111.222-33");
        c.setRg("87654321");
        
        Agencia a = new Agencia("Agencia UEPB");
        a.setCidade("Cammpina Grande");
        a.setUf("PB");
        
        Conta conta = new Conta(c, a);
        conta.setLimite(50);
        conta.setSaldo(100);
        
        System.out.println(conta.toString());
    }
    
}
