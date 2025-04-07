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

    public String toString() {
        return " \nNome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email;
    }

    public void armazenarContato(String nome, String telefone, String email) {
        Contatos contato = new Contatos(nome, telefone, email);
        contatos.add(contato);
        System.out.println("Contato cadastrado com sucesso!");

    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados.");
            return;
        } else {
            System.out.println("Lista de contatos:");
            for (int i = 0; i < contatos.size(); i++) {

                System.out.println((i + 1) + " " + contatos);
                i++;
            }
        }
    }

    public void editarContato() {
        System.out.println("Lista de contatos:");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println((i + 1) + " " + contatos);
            i++;
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
        System.out.println("Lista de contatos:");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println((i + 1) + " " + contatos);
            i++;
        }
        System.out.println("Digite o numero do contato que deseja remover");
        int numero = scanner.nextInt();
        contatos.remove(numero - 1);
        System.out.println("Contato removido com sucesso!");
    }
}
