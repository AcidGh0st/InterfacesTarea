
package InterfacesTarea;


//Definición de la interfaz Usuario que extiende la interfaz Persona.
public interface Usuario extends Persona {

    //Métodos para obtener el nombre de usuario y saldo del usuario.
   public abstract String getUsername();

    public abstract double getSaldo();

    //Métodos para depositar y retirar una cantidad específica en el saldo del usuario.
    public abstract void depositar(double cantidad);

    public abstract void retirar(double cantidad);
}
