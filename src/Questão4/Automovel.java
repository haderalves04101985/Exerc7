/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão4;

/**
 *
 * @author hader
 */
public class Automovel extends Terrestre {
    private String cor;
    private int nportas;
    private String placa;

    public Automovel(String cor, int nportas, String placa, int r) {
        super(r);
        setCor(cor);
        setNportas(nportas);
        setPlaca(placa);
    }

      
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNportas() {
        return nportas;
    }

    public void setNportas(int nportas) {
        this.nportas = nportas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    
    
}
