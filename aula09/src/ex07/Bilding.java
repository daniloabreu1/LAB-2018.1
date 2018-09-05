/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07;

/**
 *
 * @author Danilo Abreu
 */
public abstract class Bilding implements CarbonFootPrint{
    
    private int numeroPessoas, numeroLampadas;
    private boolean usoArCondicionado, energiaRenovavel;

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public int getNumeroLampadas() {
        return numeroLampadas;
    }

    public void setNumeroLampadas(int numeroLampadas) {
        this.numeroLampadas = numeroLampadas;
    }

    public boolean isUsoArCondicionado() {
        return usoArCondicionado;
    }

    public void setUsoArCondicionado(boolean usoArCondicionado) {
        this.usoArCondicionado = usoArCondicionado;
    }

    public boolean isEnergiaRenovavel() {
        return energiaRenovavel;
    }

    public void setEnergiaRenovavel(boolean energiaRenovavel) {
        this.energiaRenovavel = energiaRenovavel;
    }   
    
}
