package banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo Abreu
 */
public class Funcionario {
    private static int qtd=0;
    private final int codigo;
    private String nome, rg, cpf;
    private Calendar dataAdmin;
    private static double salario=0, bonus=0, vale=0;
    private Agencia agenciaTrabalha;
    
    public Funcionario(String nome) {
        this.nome = nome;
        this.codigo=++qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Calendar getDataAdmin() {
        return dataAdmin;
    }

    public void setDataAdmin(String dataAdmin) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataAdmin.setTime((Date)f.parse(dataAdmin));
        } catch (ParseException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static double getSalario() {
        return salario;
    }

    public static void setSalario(double salario) {
        Funcionario.salario = salario;
    }

    public static double getBonus() {
        return bonus;
    }

    public static void setBonus(double bonus) {
        Funcionario.bonus = bonus;
    }

    public static double getVale() {
        return vale;
    }

    public static void setVale(double vale) {
        Funcionario.vale = vale;
    }

    public static int getQtd() {
        return qtd;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getVencimentos() {
        return getBonus()+getSalario()+getVale();
    }

    public Agencia getAgenciaTrabalha() {
        return agenciaTrabalha;
    }

    public void setAgenciaTrabalha(Agencia agenciaTrabalha) {
        this.agenciaTrabalha = agenciaTrabalha;
    }
}
