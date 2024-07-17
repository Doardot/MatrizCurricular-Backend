package puc.matriz.projeto.cDominio.modelos;

import java.util.List;

public class Semestre {
    
    public static int nSemestres = 0;
    
    private int nSemestre;
    private List<Disciplina> disciplinas;

    public Semestre(List<Disciplina> disciplinas) {
        this.nSemestre = nSemestres++;
        this.disciplinas = disciplinas;
    }

    // getters 
    public int getnSemestre() {return nSemestre;}
    public List<Disciplina> getDisciplinas() {return disciplinas;}

    // setters
    public void setnSemestre(int nSemestre) {this.nSemestre = nSemestre;}
    public void setDisciplinas(List<Disciplina> disciplinas) {this.disciplinas = disciplinas;}

    @Override
    public String toString() {
        return "Semestre [disciplinas=" + disciplinas + ", nSemestre=" + nSemestre + "]";
    }
}