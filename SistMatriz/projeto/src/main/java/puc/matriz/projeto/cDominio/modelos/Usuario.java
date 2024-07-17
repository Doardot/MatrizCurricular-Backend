package puc.matriz.projeto.cDominio.modelos;

public class Usuario {

    public enum TipoUsuario {
        ALUNO, ADMINISTRADOR;
    }

    private TipoUsuario TipoUsuario;
    private String nome;
    private String gmail;
    private String senha;

    public Usuario(String nome, String gmail, String senha, TipoUsuario TipoUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.gmail = gmail;
        this.TipoUsuario = TipoUsuario;
    }

    // getters
    public String getNome() {return nome;}
    public String getSenha() {return senha;}
    public String getGmail() {return gmail;}
    public TipoUsuario getTipoUsuario() {return TipoUsuario;}

    // setters
    public void setNome(String nome) {this.nome = nome;}
    public void setSenha(String senha) {this.senha = senha;}
    public void setGmail(String gmail) {this.gmail = gmail;}
    public void setTipoUsuario(TipoUsuario TipoUsuario) {this.TipoUsuario = TipoUsuario;}

    @Override
    public String toString() {
        return "Usuario [gmail=" + gmail + ", nome=" + nome + ", senha=" + senha + "]";
    }
}
