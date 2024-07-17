package puc.matriz.projeto.cDominio.persistencia;
import java.util.List;
import puc.matriz.projeto.cDominio.modelos.Usuario;

public interface IUsuarioRepositorio {
    List<Usuario> listarUsuarios();
    Usuario buscarUsuarioPorGmail(String gmail);
}