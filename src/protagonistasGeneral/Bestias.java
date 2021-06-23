
package src.ProtagonistaGeneral;

import azar.Dado;

public class Bestias extends Personaje {

    private static int ataqueMaximo = 90;
    private static int instanciasBestias;

    public Bestias(int vida, int armadura, String nombre) {
        super(vida, armadura, Bestias.ataqueMaximo, nombre, false);
    }

    public static int getInstancias() {
        return Bestias.instanciasBestias;
    }

    @Override
    public int getAtaque() {
        return Dado.tirarDado(0, Bestias.ataqueMaximo, 2, true);
    }

}
