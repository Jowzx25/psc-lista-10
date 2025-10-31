public class BibliotecaApp {
    public static void main(String[] args) {
        System.out.println("## 1. Criação de Objetos ##");
        
        Livro livro1 = new Livro("O Código Limpo", "Robert C. Martin", "978-8576082675");
        Livro livro2 = new Livro("Padrões de Projeto", "Erich Gamma et al.", "978-0201633610");

        Membro membro1 = new Membro(1001, "Alice Silva", "alice@email.com", 3);

        System.out.println(livro1);
        System.out.println(membro1);
        System.out.println("----------------------------------------");


        System.out.println("## 2. Simulação de Empréstimo (Ação) ##");
        
        System.out.println("Status de 'O Código Limpo' antes: " + (livro1.isDisponivel() ? "Disponível" : "Emprestado"));

        Emprestimo emp1 = new Emprestimo(livro1, membro1, 7);
        
        System.out.println("\nEmpréstimo Criado:");
        System.out.println(emp1);
        
        System.out.println("Status de 'O Código Limpo' depois: " + (livro1.isDisponivel() ? "Disponível" : "Emprestado"));
        System.out.println("----------------------------------------");


        System.out.println("## 3. Tentativa de Novo Empréstimo ##");
        if (livro1.isDisponivel()) {
            Emprestimo emp2 = new Emprestimo(livro1, membro1, 14);
            System.out.println("Novo empréstimo de Livro 1 realizado.");
        } else {
            System.out.println("ERRO: O livro '" + livro1.getTitulo() + "' não está disponível para novo empréstimo.");
        }
        System.out.println("----------------------------------------");

        
        System.out.println("## 4. Simulação de Devolução (Ação) ##");
        
        emp1.finalizarEmprestimo(); 
        
        System.out.println("Status de 'O Código Limpo' após devolução: " + (livro1.isDisponivel() ? "Disponível" : "Emprestado"));
    }
}