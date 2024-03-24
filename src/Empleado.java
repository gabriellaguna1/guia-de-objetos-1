public class Empleado {
    private Integer dni;
    private String name;
    private String surname;
    private float salario;

    public Empleado(Integer dni, String name,  String surname, float salario) {
        this.dni=dni;
        this.name=name;
        this.surname=surname;
        this.salario=salario;
    }
    public float getSalarioAnual(float salario){
        return salario *13;
    }
    public float aumentoSalario(float porcentaje){

        return salario += (salario*porcentaje)/100;
    }

    public void getEmpleado(Empleado e){
        System.out.println("Empleado: DNI: "+e.dni+", Nombre: "+ e.name+ ", Apellido: "+ e.surname+", salario: "+e.salario);
    }

}
