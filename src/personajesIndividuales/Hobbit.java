package src.PersonajesIndividuales;

import ProtagonistaGeneral.Heroes;

public class Hobbit extends Heroes {

    private static int contadorInstancias;

    public static int getInstancias() {
        return Hobbit.contadorInstancias;
    }

    /** constructor */
    public Hobbit(String nombre) {
        super(200, 40, "Frodo");
        Hobbit.contadorInstancias++;
    }

    @Override
    public void saludar() {
        System.out.println("Soy el Hobbit --> " + this.nombre + " de la comarca ");
    }

}
