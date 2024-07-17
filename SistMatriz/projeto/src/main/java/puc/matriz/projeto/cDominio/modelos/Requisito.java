package puc.matriz.projeto.cDominio.modelos;

public class Requisito {

    public enum TipoRequisito {
        PRE, CO, ESPECIAL;
    }

    private TipoRequisito tipoRequisito;
    private Disciplina disciplinaPai;
    private Disciplina disciplinaFilha;

    public Requisito(TipoRequisito tipoRequisito, Disciplina disciplinaPai, Disciplina disciplinaFilha) {
        this.tipoRequisito = tipoRequisito;
        this.disciplinaPai = disciplinaPai;
        this.disciplinaFilha = disciplinaFilha;
    }

    // getters
    public TipoRequisito getTipoRequisito() {return tipoRequisito;}
    public Disciplina getDisciplinaPai() {return disciplinaPai;}
    public Disciplina getDisciplinaFilha() {return disciplinaFilha;}

    // setters
    public void setTipoRequisito(TipoRequisito tipoRequisito) {this.tipoRequisito = tipoRequisito;}
    public void setDisciplinaPai(Disciplina disciplinaPai) {this.disciplinaPai = disciplinaPai;}
    public void setDisciplinaFilha(Disciplina disciplinaFilha) {this.disciplinaFilha = disciplinaFilha;}

    @Override
    public String toString() {
        return "Requisito{" +
                "tipoRequisito=" + tipoRequisito +
                ", disciplinaPai=" + disciplinaPai +
                ", disciplinaFilha=" + disciplinaFilha +
                '}';
    }

}
