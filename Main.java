public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 23;
        trabajador.nombre = "luis";
        trabajador.telefono = 123456789;
        trabajador.setCredito(40000);
        trabajador.setSalario(20000);

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.getCredito());
        System.out.println(trabajador.getSalario());

    }

}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;

    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;

    }

    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito (){
        return credito;

    }

}

class Trabajador extends Cliente {
    int salario;

    public void setSalario( int salario) {
        this.salario = salario;

    }

    public int getSalario (){
        return salario;
    }
}
