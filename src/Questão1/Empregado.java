package Questão1;

public class Empregado extends Pessoa{
    private int codigoSetor;
    private int salarioBase;
    private int imposto;
    
public Empregado(String n, String e, int t, int cs, int sb, int i)
{
    super(n, e, t);
    setCodigoSetor(cs);
    setSalarioBase(sb);
    setImposto(i);    
}

public void setCodigoSetor(int c)
{
    this.codigoSetor=c;
}

public int getCodigoSetor()
{
    return this.codigoSetor;
}

public void setSalarioBase(int sb)
{
    this.salarioBase=sb;
}
public int getSalarioBase()
{
    return this.salarioBase;
}

public void setImposto(int i)
{
    this.imposto=i;
}

public int getImposto()
{
    return this.imposto;
}

public double calcularSalario()
{
    return (this.salarioBase*this.imposto/100)+salarioBase;
}


}
