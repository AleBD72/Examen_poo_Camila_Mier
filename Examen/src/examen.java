import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        // Mostrar un dialogo
        JOptionPane.showMessageDialog(null, "Bienvenido al Cajero Automatico");
        //Menú de operaciones disponibles
        ArrayList<Usuarios> usuario = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opc;
        int num_user=3;
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú de operaciones disponibles:\n1. Registrar usuario\n2. Retirar dinero\n3. Depositar dinero\n4. Salir", "Cajero automático", JOptionPane.QUESTION_MESSAGE));
        while (opc != 4) {
            switch (opc) {
                case 1:
                    for (int i=0; i < num_user;i++){
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "Registro de Usuario"+(i+1), JOptionPane.QUESTION_MESSAGE);
                        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido: ", "Registro de Usuario"+(i+1), JOptionPane.QUESTION_MESSAGE);
                        int cuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de cuenta: ", "Registro de Usuario"+(i+1), JOptionPane.QUESTION_MESSAGE));
                        int clave = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la clave para su cuenta: ", "Registro de Usuario"+(i+1), JOptionPane.QUESTION_MESSAGE));
                        double saldoU = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que posee actualmente: ", "Registro de Usuario"+(i+1), JOptionPane.QUESTION_MESSAGE));
                        usuario.add(new Usuarios(nombre, apellido, cuenta, saldoU, clave));
                    }
                    for (Usuarios usuarios: usuario) {
                        usuarios.guardarDatos();
                        usuarios.mostrarDatos();
                    }
                    break;
                case 2:
                    String numcuentaRet = JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "Retiro", JOptionPane.QUESTION_MESSAGE);
                    int cuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de cuenta: ", "Retiro", JOptionPane.QUESTION_MESSAGE));
                    int clave = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la clave para su cuenta: ", "Retiro", JOptionPane.QUESTION_MESSAGE));
                    double cantRetira = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que va a retirar: ", "Retiro", JOptionPane.QUESTION_MESSAGE));
                    JOptionPane.showMessageDialog(null, "Ha retirado"+cantRetira);


                case 3:

                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar este servicio...");
                    break;
            }

        }
    }
}