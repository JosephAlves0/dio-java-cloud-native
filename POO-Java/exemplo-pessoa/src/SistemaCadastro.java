public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("000.000.000-00", "Marcos");
        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
