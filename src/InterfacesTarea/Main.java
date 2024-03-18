package InterfacesTarea;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Ojeto cliente1 con valores específicos.
        Cliente cliente1 = new Cliente("Jose", 30, "Contador", "jose987", 1001, 1500.0);
        mostrarDatos(cliente1);
        cliente1.depositar(500.0);
        mostrarDatos(cliente1);
        cliente1.retirar(200.0);
        mostrarDatos(cliente1);
        cliente1.retirar(2000.0);
    }

    public static void mostrarDatos(Cliente cliente1) {
        //Concatena la información del cliente en un mensaje.
        String mensaje = "Nombre: " + cliente1.getNombre()
                + "\nEdad: " + cliente1.getEdad()
                + "\nCargo: " + cliente1.getCargo()
                + "\nUsername: " + cliente1.getUsername()
                + "\nCliente ID: " + cliente1.getId()
                + // Muestra el ID del cliente
                "\nSaldo: " + cliente1.getSaldo();
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

