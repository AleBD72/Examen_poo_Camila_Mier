public class transacciones {
    private int codTransac;
    private String tipoTransac;

    public transacciones(int codTransac, String tipoTransac) {
        this.codTransac = codTransac;
        this.tipoTransac = tipoTransac;
    }

    public int getCodTransac() {
        return codTransac;
    }

    public void setCodTransac(int codTransac) {
        this.codTransac = codTransac;
    }

    public String getTipoTransac() {
        return tipoTransac;
    }

    public void setTipoTransac(String tipoTransac) {
        this.tipoTransac = tipoTransac;
    }
}
