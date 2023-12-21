public class Gerente extends Empleado{
    public double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono=bono;
    }
    @Override
    public void calcularSalario(){
        System.out.println("El nombre del gerente es " + nombre + " con un bono de: " + bono + " y un sueldo total de: " + (salarioBase+bono));
    }
}
