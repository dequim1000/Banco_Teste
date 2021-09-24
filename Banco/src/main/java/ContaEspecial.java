public class ContaEspecial extends ContaCorrente implements Rendimentos{

    public ContaEspecial(int numero, int agencia, double saldo, Titular titular, double limite, double taxa) {
        super(numero, agencia, saldo, titular, limite, taxa);
    }

    @Override
    public void atualizar(double taxaRendimento) {
        this.saldo = this.saldo * (1 + taxaRendimento);
    }
}
