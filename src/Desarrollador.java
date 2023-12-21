public class Desarrollador extends Empleado{
    public int horasExtras;

    public Desarrollador(String nombre, double salarioBase, int horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras=horasExtras;
    }
    @Override
    public void calcularSalario(){
        System.out.println("El nombre del desarrolador es " + nombre + " con " + horasExtras + " horas extra (3.5$ c/hora )y recibe un sueldo total de: " + ((horasExtras*3.5)+salarioBase));
    }
}
