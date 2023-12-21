public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ofir", 460);
        Gerente gerente1 = new Gerente("Shazam", 460, 300);
        Desarrollador desarrollador1 = new Desarrollador("Link", 460, 20);
        empleado1.calcularSalario();
        gerente1.calcularSalario();
        desarrollador1.calcularSalario();
    }
}