public class Disciplina {

    private String nome;        // Nome da disciplina
    private String codicred;    // Código da disciplina

    public Disciplina(String nome, String codicred) {
        this.nome = nome;
        this.codicred = codicred;
    }

    // getters
    public String getNome(){return nome;}
    public String getCodicred(){return codicred;}

    // setters
    public void setNome(String nome){this.nome = nome;}
    public void setCodicred(String codicred){this.codicred = codicred;}
}
