package puc.matriz.projeto.cDominio.persistencia;
import java.util.List;
import puc.matriz.projeto.cDominio.modelos.Disciplina;

public interface IDisciplinaRepositorio {
    void cadastrarDisciplina(Disciplina disciplina);
    void removerDisciplina(Disciplina disciplina);
    void atualizarDisciplina(Disciplina disciplina);
    List<Disciplina> listarDisciplinas();
    Disciplina buscarDisciplinaPorCodcred(String codcred);
    void atualizaCredtitos(String codcred, int creditos);
}
