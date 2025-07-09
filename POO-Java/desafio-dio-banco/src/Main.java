public class Main {
    public static void main(String[] args) {

        Cliente bento = new Cliente();
        bento.setNome("Bento");
        Conta cc = new ContaCorrente(bento);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(bento);

        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
