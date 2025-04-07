public class App {
    public static void main(String[] args) throws Exception {
        
        Contatos c = new Contatos("Marcus", "61998090870", "marcus@gmail.com");
        c.armazenarContato();
        c.listarContatos();
        c.editarContato();
        c.listarContatos();
        c.removerContato();

        
    }
}
