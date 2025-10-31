public class Membro {
    private int idMembro;
    private String nome;
    private String email;
    private int maxEmprestimos;

    public Membro(int idMembro, String nome, String email, int maxEmprestimos) {
        this.idMembro = idMembro;
        this.nome = nome;
        this.email = email;
        this.maxEmprestimos = maxEmprestimos;
    }

    public int getIdMembro() {
        return idMembro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaxEmprestimos() {
        return maxEmprestimos;
    }
    
    @Override
    public String toString() {
        return "Membro [ID: " + idMembro + ", Nome: " + nome + ", Email: " + email + "]";
    }
}