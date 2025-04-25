public class Conta {

    private String numeroConta;
    private double saldo;
    private final double valorChequeEspecial;
    private double valorUtilizadoChequeEspecial;
    private boolean utilizandoChequeEspecial;

    public Conta (String numeroConta, double valorDeposito) {
        this.numeroConta = numeroConta;
        this.saldo = valorDeposito;
        this.valorChequeEspecial = calculoValorChequeEspecial(valorDeposito);
    }

    private double calculoValorChequeEspecial(Double valorDeposito) {
        if (valorDeposito <= 500) {
            return 50;
        }
        return valorDeposito * 0.50;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        double taxaUtilizacaoChequeEspecial = this.valorUtilizadoChequeEspecial * 0.20;
        if(this.saldo >= (this.valorUtilizadoChequeEspecial + taxaUtilizacaoChequeEspecial)) {
            this.saldo -= (this.valorUtilizadoChequeEspecial + taxaUtilizacaoChequeEspecial);
            valorUtilizadoChequeEspecial = 0;
        }

    }

    public boolean sacar(double valorSaque) {
        return realizarDebito(valorSaque);
    }

    public boolean pagarBoleto(double valorBoleto) {
        return realizarDebito(valorBoleto);
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void getSaldo() {
        System.out.println("\nO saldo da conta " + this.numeroConta + " é: " + this.saldo);
    }

    public void getChequeEspecial(){
        System.out.println("\nO valor do cheque especial é: " + this.valorChequeEspecial);
        System.out.println("Você utilizou " + (this.valorUtilizadoChequeEspecial) + " do Cheque Especial" );
        System.out.println("Saldo do cheque especial é: " + (this.valorChequeEspecial - this.valorUtilizadoChequeEspecial));
    }

    public void isUtilizandoChequeEspecial() {
        if (valorUtilizadoChequeEspecial > 0) {
            System.out.println("\nNo momento você está utilizando o Cheque Especial");
        } else {
            System.out.println("\nVocê não está utilizando o Cheque Especial");
        }
        this.getChequeEspecial();
    }

    private boolean realizarDebito(double valor) {
        double saldoAntes = this.saldo;
        double saldoDisponivel = this.saldo + (this.valorChequeEspecial - this.valorUtilizadoChequeEspecial);

        if (valor <= saldoDisponivel) {
            this.saldo -= valor;
            if (this.saldo < 0) {
                this.saldo = 0;
                this.valorUtilizadoChequeEspecial = valor - saldoAntes;
            }
            return true;
        }

        return false;
    }

}
