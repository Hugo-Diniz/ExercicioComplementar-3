package exercicio;

public class Estudante {
    private String nome;
    private int matricula;
    private double n1,n2,n3;

    public Estudante(String nome, int matricula, double n1, double n2, double n3) {
        this.nome = nome;
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return this.n1;

    }
    public double getNota2() {
        return this.n2;

    }
    public double getNota3() {
        return this.n3;
    }

    public void setN1(double valor) throws NotaInvalidaException{
        if (valor < 0 || valor > 10) {
            throw new NotaInvalidaException();
        }else {
            this.n1 = valor;
        }
    }

    public void setN2(double valor) throws NotaInvalidaException{
        if (valor < 0 || valor > 10) {
            throw new NotaInvalidaException();
        }else {
            this.n2 = valor;
        }
    }

    public void setN3(double valor) throws NotaInvalidaException{
        if (valor < 0 || valor > 10) {
            throw new NotaInvalidaException();
        }else {
            this.n3 = valor;
        }
    }

    public void setNotas(double n1, double n2, double n3) throws NotaInvalidaException{
        if ((n1 < 0 || n1 > 10) || (n2 < 0 || n2 > 10) || (n3 < 0 || n3 > 10)) {
            throw new NotaInvalidaException();
        } else {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
        }
    }

    public double getMedia() {
        return ((this.n1 + this.n2 + this.n3) / 3);
    }
}