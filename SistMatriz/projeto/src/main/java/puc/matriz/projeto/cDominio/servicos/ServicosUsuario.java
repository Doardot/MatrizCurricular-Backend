package puc.matriz.projeto.cDominio.servicos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import puc.matriz.projeto.cDominio.modelos.Usuario;
import puc.matriz.projeto.cDominio.modelos.Usuario.TipoUsuario;
import puc.matriz.projeto.cDominio.persistencia.IUsuarioRepositorio;

@Service
public class ServicosUsuario {
    
    @Autowired
    private IUsuarioRepositorio usuarioRepos;

    public ServicosUsuario(IUsuarioRepositorio usuarioRepos){
        this.usuarioRepos = usuarioRepos;
    }

    // listar todos os usuários
    public List<Usuario> listarUsuarios(){
        return usuarioRepos.listarUsuarios();
    }

    // login de usuário
    public TipoUsuario login(String email, String senha){
        
        Usuario usuario = usuarioRepos.buscarUsuarioPorGmail(email);
       
        if(usuario != null && usuario.getSenha().equals(senha)){
            return usuario.getTipoUsuario();
        }
        
        return null;
    }

    
}
