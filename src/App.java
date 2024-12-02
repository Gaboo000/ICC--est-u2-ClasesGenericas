import models.Persona;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {

        Persona[] personas = {
            new Persona("Ana", 17), 
            new Persona("Luis", 15), 
            new Persona("Maria", 22), 
            new Persona("Carlos", 25), 
            new Persona("Juan", 34), 
            new Persona("Manuel", 18), 
            new Persona("Elena", 19),
            new Persona("Lucas", 20), 
            new Persona("Pedro", 13), 
            new Persona("Marta", 16), 
        }

        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Par<String, Integer>[] mayores = new Par[10];
        Par<Integer,String>[] menores = new Par[10];


        cajaString.setObjeto("nose");
        cajaInteger.setObjeto(10);
        //cajaPersona.setObjeto(persona);


        int indiceMayores = 0;
        int indiceMenor = 0;

        for(Persona persona: personas){
            if(persona.getEdad() >= 18){
                mayores[indiceMayores++] = new Par<>(persona.getNombre(), persona.getEdad());
            }else{
                menores[indiceMenor++] = new Par<>(persona.getEdad(), persona.getNombre());

            }

        }




        System.out.println("Mayores de edad:");

        for (Par<String, Integer> par : mayores) {
            if (par != null){
                System.out.println(par);
            }
        }
        //cajaPersona.setObjeto(new Persona());



        System.out.println(cajaString.getObjeto());
        System.out.println(cajaInteger.getObjeto());
        System.out.println(cajaPersona.getObjeto());


        

        
    }
}
