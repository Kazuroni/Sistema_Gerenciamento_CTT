package Sistema_Gerencimento_CTT;

public class ContatoPessoal extends Contato {
    private String telefone;

    public ContatoPessoal(String nome, String email, String telefone) {
        super(nome, email);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(this + ", Telefone: " + telefone);
    }
}
