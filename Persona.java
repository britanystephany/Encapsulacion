public class Persona {
    private int Edad;
    private String Nombre;
    private String  Telefono;

    //CONSTRUCTOR
    public Persona (){
    }
    //GET
    public int getEdad(){
        return Edad;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getTelefono (){
        return Telefono;
    }
    //SET
    public void setEdad (int Edad){
        this.Edad = Edad;
    }
    public void setNombre (String Nombre){
        this.Nombre=Nombre;
    }
    public void setTelefono (String Telefono){
        this.Telefono=Telefono;
    }
    public static void main (String [] args){
        Persona persona = new Persona();

        persona.setEdad(18);
        System.out.println("Edad: " + persona.getEdad());

        persona.setNombre ("Britany");
        System.out.println("Nombre: " + persona.getNombre());

        persona.setTelefono("5567399878");
        System.out.println ("Telefono: " + persona.getTelefono());
    }
}
