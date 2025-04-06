import java.util.ArrayList;
import java.util.List;

public class Contatos {
    private String nome;
    private String telefone;
    private String email;
    List<Contatos> contatos = new ArrayList<>();

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
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email;
    }

    public void armazenarContato() {
        // Implementação do método para armazenar o contato
        contatos.add(this);
        System.out.println("Contato armazenado com sucesso!");
    }

    public void listaContatos(){
        for(Contatos contatos : contatos){
            System.out.println(contatos);
        }
    }

}
