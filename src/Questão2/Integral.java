package Questão2;
public class Integral extends Professores
{
    private double salario;
    
    public Integral(String n, int i, int m, double s)
    {
        super(n, i, m);
        setSalario(s);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
