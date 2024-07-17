package puc.matriz.projeto.cDominio.persistencia;

import puc.matriz.projeto.cDominio.modelos.Semestre;

public interface ISemestreRepositorio {
    void cadastrarSemestre(Semestre semestre);
    void alterarSemestre(Semestre semestre);
    void excluirSemestre(Semestre semestre);
    
    void adicionarDisciplina(Semestre semestre);
    void removerDisciplina(Semestre semestre);

    void adicionarRequisito(Semestre semestre);
    void removerRequisito(Semestre semestre);
}
