import javax.swing.*;
import java.io.*;
public class Usuarios {
    private String nomUsuario;
    private String apelUsuario;
    private int numCuenta;
    private double saldoDisponible;
    private int claveUsuario;

    public Usuarios(String nomUsuario, String apelUsuario, int numCuenta, double saldoDisponible, int claveUsuario) {
        this.nomUsuario = nomUsuario;
        this.apelUsuario = apelUsuario;
        this.numCuenta = numCuenta;
        this.saldoDisponible = saldoDisponible;
        this.claveUsuario = claveUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getApelUsuario() {
        return apelUsuario;
    }

    public void setApelUsuario(String apelUsuario) {
        this.apelUsuario = apelUsuario;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public int getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(int claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public void guardarDatos(){
        try {
            PrintWriter miPr = new PrintWriter("usuarios.txt");
            miPr.println(getNomUsuario());
            miPr.println(getApelUsuario());
            miPr.println(getNumCuenta());
            miPr.println(getSaldoDisponible());
            miPr.println(getClaveUsuario());
            miPr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void mostrarDatos (){
        JOptionPane.showMessageDialog( null,"DATOS ESTUDIANTE " +
                "\nNombre: "+getNomUsuario()+
                "\nApellido: "+getApelUsuario()+
                "\n Numero de cuenta: "+getNumCuenta()+"" +
                "\nSaldo cuenta: "+getSaldoDisponible()+"" +
                "\nClave cuenta: "+getClaveUsuario());

    }
}

