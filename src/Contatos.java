import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contatos {
    private String nome;
    private String telefone;
    private String email;
    List<Contatos> contatos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Contatos() {
    }

    public Contatos(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contatos [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
    }

    public void armazenarContato(String nome, String telefone, String email) {
        for (Contatos contato : contatos) {
            if (contato.getNome().equals(nome)) {
                System.out.println("Já existe um contato com esse nome.");
                return;
            }
        }
        Contatos contato = new Contatos(nome, telefone, email);
        contatos.add(contato);
        System.out.println("Contato cadastrado com sucesso!");
        System.out.println(contatos.size());

    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados.");
            return;
        } else {
            System.out.println("Lista de contatos:");
            for (int i = 0; i < contatos.size(); i++) {

                Contatos contato = contatos.get(i);
                int indice = i + 1;
                System.out.println(indice + "- Nome:" + contato.getNome() + " Telefone:" + contato.getTelefone()
                        + " Email:" + contato.getEmail());

            }
        }
    }

    public void editarContato() {

        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados.");
            return;
        }
        System.out.println("Lista de contatos:");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println((i + 1) + "- " + contatos.get(i));
            
        }
        System.out.println("Digite o número do contato que deseja editar");
        int numero = scanner.nextInt();
        System.out.println("Digite o novo nome do contato");
        String nome = scanner.next();
        System.out.println("Digite o novo telefone do contato");
        String telefone = scanner.next();
        System.out.println("Digite o novo email do contato");
        String email = scanner.next();

        contatos.get(numero - 1).setNome(nome);
        contatos.get(numero - 1).setTelefone(telefone);
        contatos.get(numero - 1).setEmail(email);
        System.out.println("Contato atualizado com sucesso!");
    }

    public void removerContato() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados.");
            return;
        }

        System.out.println("Lista de contatos:");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println((i + 1) + "- " + contatos.get(i));
            
        }
        System.out.println("Digite o numero do contato que deseja remover");
        int numero = scanner.nextInt();
        contatos.remove(numero - 1);
        System.out.println("Contato removido com sucesso!");
    }
}
