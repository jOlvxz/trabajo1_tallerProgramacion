// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            EmpleadoIndefinido empleadoPlanta = new EmpleadoIndefinido("jean", "olivares", 300000, 12);
            System.out.println("OBJETO CLASE EMPLEADO INDEFINIDO");
            empleadoPlanta.informacion();
            System.out.println("---");
            empleadoPlanta.pagarFiniquito();
            System.out.println("---");
            empleadoPlanta.darVacaciones();
            System.out.println("*-------------------------*");

            EmpleadoTemporal empleadoTemporada = new EmpleadoTemporal("elpi", "chula" , 300000, 4);
            System.out.println("OBJETO CLASE EMPLEADO TEMPORAL");
            empleadoTemporada.informacion();
            System.out.println("---");
            empleadoTemporada.pagarFiniquito();
            System.out.println("---");
            empleadoTemporada.extenderContrato(4);
            System.out.println("---");
            empleadoTemporada.darVacaciones();
            System.out.println("---");
            empleadoTemporada.informacion();

        } catch (Error e){
            System.out.println("ups ! ");
        }



    }
}