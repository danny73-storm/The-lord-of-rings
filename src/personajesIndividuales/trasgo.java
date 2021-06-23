
package src.PersonajesIndividuales;

import ProtagonistaGeneral.Bestias;

public class Trasgo extends Bestias {

    private static int contadorInstancias;

    public static int getInstancias() {
        return Trasgo.contadorInstancias;
    }

    public Trasgo(String nombre) {
        super(325, 46, "Krilgash");
    }

    public void saludar() {
        System.out.println("Soy Trasgo --> " + this.nombre + " y te voy a matar");
    }
}
