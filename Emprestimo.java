import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private boolean ativo;

    public Emprestimo(Livro livro, Membro membro, int diasEmprestimo) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = LocalDate.now();
        this.dataPrevistaDevolucao = this.dataEmprestimo.plusDays(diasEmprestimo);
        this.ativo = true;
        
        livro.setDisponivel(false); 
    }

    public Livro getLivro() {
        return livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void finalizarEmprestimo() {
        this.ativo = false;
        this.livro.setDisponivel(true);
        System.out.println("Empréstimo de '" + livro.getTitulo() + "' finalizado. Livro devolvido.");
    }
    
    @Override
    public String toString() {
        return "Emprestimo [Livro: " + livro.getTitulo() + ", Membro: " + membro.getNome() + 
               ", Data: " + dataEmprestimo + ", Devolução: " + dataPrevistaDevolucao + 
               ", Ativo: " + (ativo ? "Sim" : "Não") + "]";
    }
}