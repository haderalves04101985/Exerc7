
package Questão2;
public class Horistas extends Professores{
    private double val;
    private double horas;
    
    public Horistas(String n, int i, int m, double v, double h)
    {
        super(n, i, m);
        setVal(v);
        setHoras(h);
        
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public double salario()
    {
        return this.horas*this.val;
    }
    
}
