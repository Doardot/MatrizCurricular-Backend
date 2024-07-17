package puc.matriz.projeto.cDominio.persistencia;

import java.util.List;

import puc.matriz.projeto.cDominio.modelos.Curso;

public interface ICursoRepositorio {
    List<Curso> listarCursos();
    Curso buscarCursoPorCurriculo(String codCurricular);
    void adicionarDisciplina(Curso curso, String codDisciplina);
    void removerDisciplina(Curso curso, String codDisciplina);
    void adicionarRequisito(Curso curso, String codDisciplinaPai, String codDisciplinaFilha);
    void removerRequisito(Curso curso, String codDisciplinaPai, String codDisciplinaFilha);
}