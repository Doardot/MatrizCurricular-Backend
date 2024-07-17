package puc.matriz.projeto.cDominio.modelos;

import java.util.List;

public class Curso {
    
    private String nome;
    private String codigoCurricular;
    private int qtdSemestres;
    private List<Disciplina> disciplinas;
    private List<Requisito> requisitos;

    public Curso(String nome, String codigoCurricular, int qtdSemestres, List<Disciplina> disciplinas, List<Requisito> requisitos) {
        this.nome = nome;
        this.codigoCurricular = codigoCurricular;
        this.qtdSemestres = qtdSemestres;
        this.disciplinas = disciplinas;
        this.requisitos = requisitos;
    }

    // getters
    public String getNome() {return nome;}
    public String getCodigoCurricular() {return codigoCurricular;}
    public int getQtdSemestres() {return qtdSemestres;}
    public List<Disciplina> getDisciplinas() {return disciplinas;}
    public List<Requisito> getRequisitos() {return requisitos;}

    // setters
    public void setNome(String nome) {this.nome = nome;}
    public void setCodigoCurricular(String codigoCurricular) {this.codigoCurricular = codigoCurricular;}
    public void setQtdSemestres(int qtdSemestres) {this.qtdSemestres = qtdSemestres;}
    public void setDisciplinas(List<Disciplina> disciplinas) {this.disciplinas = disciplinas;}
    public void setRequisitos(List<Requisito> requisitos) {this.requisitos = requisitos;}

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoCurricular='" + codigoCurricular + '\'' +
                ", qtdSemestres=" + qtdSemestres +
                ", disciplinas=" + disciplinas +
                '}';
    }

}
