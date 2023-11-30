package Sistema_Gerencimento_CTT;

import java.util.ArrayList;

public class MainContatos {
    public static void main(String[] args) {
        ArrayList<Contato> listaContatos = new ArrayList<>();

        // Adicionando contatos à lista
        listaContatos.add(new ContatoPessoal("João", "joao@gmail.com", "123-456789"));
        listaContatos.add(new ContatoProfissional("Maria", "maria@gmail.com", "EmpresaXYZ"));
        listaContatos.add(new ContatoPessoal("Carlos", "carlos@gmail.com", "987-654321"));

        // Iterando e realizando operações comuns
        for (Contato contato : listaContatos) {
            System.out.println(contato);
            contato.exibirDetalhes();
            // Aqui você pode realizar outras operações comuns, como enviar mensagens, etc.
        }
    }
}
