package Sistema_Gerencimento_CTT;

public abstract class Contato {
    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public abstract void exibirDetalhes();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email;
    }
}
