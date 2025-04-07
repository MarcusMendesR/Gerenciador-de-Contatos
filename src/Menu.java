import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    public void mostarMenu() {
        Contatos cadastro = new Contatos();
        do {
            System.out.println("-------------------------------------");
            System.out.println("1- Cadastrar Contato");
            System.out.println("2- Listar Contatos");
            System.out.println("3- Editar Contato");
            System.out.println("4- Remover Contato");
            System.out.println("5- Sair");
            System.out.println("-------------------------------------");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do contato");
                    String nome = scanner.next();
                    System.out.println("Digite o telefone do contato");
                    String telefone = scanner.next();
                    System.out.println("Digite o email do contato");
                    String email = scanner.next();
                    cadastro.armazenarContato(nome, telefone, email);
                    break;

                case 2:
                    if (cadastro != null)
                        cadastro.listarContatos();
                    break;

                case 3:
                    if (cadastro != null)
                        cadastro.editarContato();
                    break;

                case 4:
                    if (cadastro != null)
                        cadastro.removerContato();
                    break;

                default:
                    break;
            }
        } while (opcao != 5);
        System.out.println("Obrigado por usar nosso sistema!");
        scanner.close();
    }
}