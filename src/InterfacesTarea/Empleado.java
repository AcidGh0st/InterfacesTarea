
package InterfacesTarea;


//Definición de la interfaz Empleado que extiende la interfaz Persona.
public interface Empleado extends Persona {

   //Métodos para obtener el cargo y ID del empleado.
   public abstract String getCargo();

   public abstract int getId();


}
