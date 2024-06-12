import java.util.ArrayList;
import java.util.List;

public class Semestre {

    private static int contador = 0;      // Variável estática para contar os semestres
    private int numero;                   // numero do semestre
    private List<Disciplina> disciplinas; // Lista de disciplinas

    public Semestre() {
        this.numero = ++contador; 
        this.disciplinas = new ArrayList<>();
    }

    // getters
    public int getNumero(){return numero;}
    public List<Disciplina> getDisciplinas(){return disciplinas;}

    // setters
    public void setNumero(int numero){this.numero = numero;}
    public void setDisciplinas(List<Disciplina> disciplinas){this.disciplinas = disciplinas;}

    // Adiciona disciplina ao semestre
    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    // Remove disciplina do semestre
    public void removerDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    @Override
    public String toString() {
        return "Semestre{" +
                "numero=" + numero +
                ", disciplinas=" + disciplinas +
                '}';
    }

}
