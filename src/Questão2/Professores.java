package Questão2;

public class Professores {
    private String nome;
    private int idade;
    private int matricula;

    public Professores(String nome, int idade, int matricula) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
