package AtividadeSeis;

public class ContaBancaria {
    private double saldo;
    private double numeroDaConta;


    public ContaBancaria(double saldo, double numeroDaConta){
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(double numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
}
