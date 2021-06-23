package src.PersonajesIndividuales;

import ProtagonistaGeneral.Heroes;
import ProtagonistaGeneral.Personaje;

public class Elfo extends Heroes {

    public Elfo(String nombre) {
        super(250, 60, "Legolas");
    }

    @Override
    public void saludar() {
        System.out.println("Soy el elfo silvano --> " + this.nombre + " del bosque negro");
    }

    @Override
    public int obtenerAtaque(Personaje defensor) {
        if (defensor instanceof Orco) {
            System.out.println(" " + this.getNombre() + " furia elfica ");
            return this.getAtaque() + 10;

        }

        return this.getAtaque();
    }
}
