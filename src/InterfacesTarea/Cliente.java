package InterfacesTarea;

import javax.swing.JOptionPane;

class Cliente implements Usuario, Empleado {

    //Variables de instancia privadas que almacenan informacion.
    private String nombre;
    private int edad;
    private String cargo;
    private String username;
    private double saldo;
    private int id;

    //Constructor de la clase Cliente que inicializa sus campos.
    Cliente(String nombre, int edad, String cargo, String username, int id, double saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.username = username;
        this.id = id;
        this.saldo = saldo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    public int getId() {
        return id;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    //Implementación de los métodos de la interfaz Usuario para
    //depositar y retirar dinero del saldo del cliente.
    @Override
    public void depositar(double cantidad) {
        saldo += cantidad; //Aumenta el saldo con la cantidad especificada.
        JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: " + saldo);
    }

    @Override
    public void retirar(double cantidad) {
        //Verifica si hay suficiente saldo para realizar el retiro.
        if (saldo >= cantidad) {
            saldo -= cantidad; //Reduce el saldo con la cantidad especificada
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar el retiro.");
        }
    }

}
