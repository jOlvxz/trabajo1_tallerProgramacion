public class Empleado {
    // Atributos
    private String nombre;
    private String apellido;
    private int salario;
    private int tiempoContrato;
    private int diasVacaciones;
    private boolean hasVacaciones;

    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setTiempoContrato(int tiempoContrato) {
        this.tiempoContrato = tiempoContrato;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public void setHasVacaciones(boolean hasVacaciones) {
        this.hasVacaciones = hasVacaciones;
    }

    // Getters

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getSalario() {
        return this.salario;
    }

    public int getTiempoContrato() {
        return this.tiempoContrato;
    }

    public int getDiasVacaciones() {
        return this.diasVacaciones;
    }

    public boolean getHasVacaciones(){
        return this.hasVacaciones;
    }

    // Métodos

    public void informacion(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Salario: " + getSalario());
        System.out.println("Tiempo de contrato: " + getTiempoContrato());
        System.out.println("Dias de Vacaciones: " + getDiasVacaciones());
        System.out.println("Opta a vacaciones: " + getHasVacaciones());
    }

    public void pagarFiniquito(){
        int finiquito = getSalario() * getTiempoContrato();
        System.out.println("Saldo a pagar: " + finiquito);
    }
    public void darVacaciones(){
        int dias = getTiempoContrato() * 2;
        setDiasVacaciones(dias);
        System.out.println("Los dias de vacaciones disponibles son: " + getDiasVacaciones());
    }
}

