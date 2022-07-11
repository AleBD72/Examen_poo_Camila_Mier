public class deposito extends transacciones{
    private int numCuentaDe;
    private double cantidadDeposita;
    private double saldoUsuario;

    public deposito(int codTransac, String tipoTransac, int numCuentaDe, double cantidadDeposita, double saldoUsuario) {
        super(codTransac, tipoTransac);
        this.numCuentaDe = numCuentaDe;
        this.cantidadDeposita = cantidadDeposita;
        this.saldoUsuario = saldoUsuario;
    }

    public int getNumCuentaDe() {
        return numCuentaDe;
    }

    public void setNumCuentaDe(int numCuentaDe) {
        this.numCuentaDe = numCuentaDe;
    }

    public double getCantidadDeposita() {
        return cantidadDeposita;
    }

    public void setCantidadDeposita(double cantidadDeposita) {
        this.cantidadDeposita = cantidadDeposita;
    }

    public double getSaldoUsuario() {
        return saldoUsuario;
    }

    public void setSaldoUsuario(double saldoUsuario) {
        this.saldoUsuario = saldoUsuario;
    }
}
