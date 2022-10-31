public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setName ("Leonardo");
        persona.setAge ("36");
        persona.setPhone ("654721969");

        System.out.println(persona.getName());
        System.out.println(persona.getAge());
        System.out.println(persona.getPhone());
}
}
/* Creacion de Clase Persona y Variables Privadas*/
class Persona{
    private String name;
    private String age;
    private String phone;
/* Creacion de SET de variables */
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
/* Creacion de GET de Variables */
    public String getName () {
        return this.name;
    }
    public String getAge () {
        return this.age;
    }
    public String getPhone () {
        return this.phone;
    }
}

