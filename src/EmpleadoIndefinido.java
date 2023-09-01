public class EmpleadoIndefinido extends Empleado{
    public EmpleadoIndefinido(String nombre, String apellido, int salario, int tiempoContrato){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setSalario(salario);
        super.setTiempoContrato(tiempoContrato);
        if (tiempoContrato > 6){
            super.setHasVacaciones(true);
        }
    }

    public void pagarFiniquito(){
        if (super.getTiempoContrato() > 12){
            int bono = 50000;
            super.setSalario(getSalario()+bono);
        }
        super.pagarFiniquito();
    }

    public void darVacaciones(){
        if (super.getHasVacaciones()){
            super.darVacaciones();
        }
    }
}
