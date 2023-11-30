package Sistema_Gerencimento_CTT;

public class ContatoProfissional extends Contato {
    private String empresa;

    public ContatoProfissional(String nome, String email, String empresa) {
        super(nome, email);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(this + ", Empresa: " + empresa);
    }
}
