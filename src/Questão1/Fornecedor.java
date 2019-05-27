package Questão1;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;
    
public Fornecedor(String n, String e, int t, double vc, double vd)
{
    super(n, e, t);
    setValorCredito(vc);
    setValorDivida(vd);

}

    public double getValorCredito() {
        return this.valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return this.valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo()
    {
        return this.valorCredito-this.valorDivida;
    }
    
}
