package puc.matriz.projeto.cDominio.persistencia;
import puc.matriz.projeto.cDominio.modelos.Requisito;

public interface IRequisitoRepositorio {
    void cadastrarRequisito(Requisito requisito);
    void alterarRequisito(Requisito requisito);
    void excluirRequisito(Requisito requisito);
}
