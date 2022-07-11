public class retiro extends transacciones{
    private int numcuentaRe;
    private double cantidadRetira;


    public retiro(int codTransac, String tipoTransac, int numcuentaRe, double cantidadRetira) {
        super(codTransac, tipoTransac);
        this.numcuentaRe = numcuentaRe;
        this.cantidadRetira = cantidadRetira;
    }

    public int getNumcuentaRe() {
        return numcuentaRe;
    }

    public void setNumcuentaRe(int numcuentaRe) {
        this.numcuentaRe = numcuentaRe;
    }

    public double getCantidadRetira() {
        return cantidadRetira;
    }

    public void setCantidadRetira(double cantidadRetira) {
        this.cantidadRetira = cantidadRetira;
    }


}
