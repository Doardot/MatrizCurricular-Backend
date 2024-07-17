package puc.matriz.projeto.cDominio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import puc.matriz.projeto.cDominio.modelos.Curso;
import puc.matriz.projeto.cDominio.persistencia.ICursoRepositorio;

@Service
public class ServicoCurso {

    @Autowired
    private ICursoRepositorio cursoRepos;

    public ServicoCurso(ICursoRepositorio cursoRepos){
        this.cursoRepos = cursoRepos;
    }

    // listar todos os cursos
    public List<Curso> listarCursos(){
        return cursoRepos.listarCursos();
    }

    // buscar curso por currículo
    public Curso buscarCursoPorCurriculo(String codCurricular){
        return cursoRepos.buscarCursoPorCurriculo(codCurricular);
    }

    // adicionar disciplina ao curso
    public void adicionarDisciplina(Curso curso, String codDisciplina){
        cursoRepos.adicionarDisciplina(curso, codDisciplina);
    }

    // remover disciplina do curso
    public void removerDisciplina(Curso curso, String codDisciplina){
        cursoRepos.removerDisciplina(curso, codDisciplina);
    }

    // adicionar requisito ao curso
    public void adicionarRequisito(Curso curso, String codDisciplinaPai, String codDisciplinaFilha){
        cursoRepos.adicionarRequisito(curso, codDisciplinaPai, codDisciplinaFilha);
    }

    // remover requisito do curso
    public void removerRequisito(Curso curso, String codDisciplinaPai, String codDisciplinaFilha){
        cursoRepos.removerRequisito(curso, codDisciplinaPai, codDisciplinaFilha);
    }
    
}
