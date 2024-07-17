package puc.matriz.projeto.cDominio.modelos;

public class Disciplina {

    private String nome;
    private String codcred;
    private int creditos;

    public Disciplina(String nome, String codcred, int creditos) {
        this.nome = nome;
        this.codcred = codcred;
        this.creditos = creditos;
    }

    // getters 
    public String getNome() {return nome;}
    public String getCodcred() {return codcred;}
    public int getCreditos() {return creditos;}

    // setters
    public void setNome(String nome) {this.nome = nome;}
    public void setCodcred(String codcred) {this.codcred = codcred;}
    public void setCreditos(int creditos) {this.creditos = creditos;}

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", codcred='" + codcred + '\'' +
                ", creditos=" + creditos +
                '}';
    }

}
