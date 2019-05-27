package Questão1;

public class Teste {
public static void main(String[] Args)
{
    Pessoa p1=new Pessoa("HADER", "RUA, A, 85", 999119903);
    Fornecedor f1=new Fornecedor("EMPRESA1", "AVENIDA", 37431000, 10000, 3000);
    Empregado e1=new Empregado("Hader", "Rua A", 999119903, 1020, 2000, 8);
    System.out.println(f1.obterSaldo());
    System.out.println(e1.calcularSalario());
}
}
