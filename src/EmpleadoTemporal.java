public class EmpleadoTemporal extends Empleado{
    private boolean isRenovado;

    public EmpleadoTemporal(String nombre, String apellido, int salario, int tiempoContrato){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setSalario(salario);
        super.setTiempoContrato(tiempoContrato);
    }

    // Setter y Getter
    public void setIsRenovado(boolean isRenovado){
        this.isRenovado = isRenovado;
    }

    public boolean getIsRenovado(){
        return this.isRenovado;
    }

    // metodos

    public void extenderContrato(int meses){
        setIsRenovado(true);
        super.setTiempoContrato(super.getTiempoContrato()+meses);
        if (super.getTiempoContrato() > 6){
            super.setHasVacaciones(true);
        }
    }

    public void darVacaciones(){
        if (super.getHasVacaciones()){
            super.darVacaciones();
        }
    }

}
