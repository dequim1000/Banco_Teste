public class ContaPoupanca extends Conta implements Rendimentos{
    public ContaPoupanca(int numero, int agencia, double saldo, Titular titular) {
        super(numero, agencia, saldo, titular);
    }

    public void atualizar(double taxaRendimento){
        this.saldo = this.saldo * (1 + taxaRendimento);
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
