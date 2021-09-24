public class ContaCorrente extends Conta{
    private double limite;
    private double taxa;

    public ContaCorrente(int numero, int agencia, double saldo, Titular titular, double limite, double taxa) {
        super(numero, agencia, saldo, titular);
        this.limite = limite;
        this.taxa = taxa;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        return false;
    }
}
