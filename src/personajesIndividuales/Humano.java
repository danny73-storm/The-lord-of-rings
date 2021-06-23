package src.PersonajesIndividuales;

import ProtagonistaGeneral.Heroes;

public class Humano extends Heroes {

    private static int contadorInstancias;

    public Humano(String nombre) {
        super(180, 75, "Aragon");
        Humano.contadorInstancias++;
    }

    public static int getInstancias() {
        return contadorInstancias;
    }

    @Override
    public void saludar() {
        System.out.println("Soy hombre --> " + this.nombre + " de Gondor");
    }

}
