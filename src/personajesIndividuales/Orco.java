package src.PersonajesIndividuales;

import ProtagonistaGeneral.Bestias;

public class Orco extends Bestias {

    private static int contadorInstancias;

    public static int getInstancias() {
        return Orco.contadorInstancias;
    }

    public Orco(String nombre) {
        super(300, 45, "Azosh");
    }

    public void saludar() {
        System.out.println("Soy Orco --> " + this.nombre + " y te voy a matar ");
    }

}
