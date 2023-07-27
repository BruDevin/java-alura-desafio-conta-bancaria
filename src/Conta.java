public class Conta {
    private double saldo = 1000;

    public double getSaldo() {
        return saldo;
    }

    public void deposito (double deposito) {
        saldo += deposito;
    }

    public void saque (double saque) {
        if (saldo >= saque) {
            saldo -= saque;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
