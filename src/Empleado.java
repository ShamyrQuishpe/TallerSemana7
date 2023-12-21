public class Empleado {
    public String nombre;
    public double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre=nombre;
        this.salarioBase=460;
    }

    public void calcularSalario(){
        System.out.println("El nombre del empleado es " + nombre + " y tiene un sueldo de: " + salarioBase);
    }
}
