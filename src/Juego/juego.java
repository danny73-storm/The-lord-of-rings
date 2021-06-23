
package src.Juego;

import PersonajesIndividuales.Elfo;
import PersonajesIndividuales.Hobbit;
import PersonajesIndividuales.Humano;
import PersonajesIndividuales.Orco;
import PersonajesIndividuales.Trasgo;
import ProtagonistaGeneral.Bestias;
import ProtagonistaGeneral.Heroes;
import ProtagonistaGeneral.Personaje;
import azar.Dado;

public class juego {

    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];

    private final int CANTIDAD = 5;

    // private int contadorHumanos;

    public juego() {
        ejercitoBestias = new Bestias[CANTIDAD];
        ejercitoHeroes = new Heroes[CANTIDAD];
    }

    public void presentarPersonajes(Personaje ejercito[]) {

        if (ejercito.length > 0) {
            String tempo = "";

            if (ejercito[0] instanceof Bestias) {
                System.out.println(
                        "\n***********************************************************************************");
                System.out.println(
                        "Queremos que toda la tierra media se sumerja en oscuridad para nuestro amo ¡¡SAURON!!");
                System.out.println(
                        "*************************************************************************************");
                tempo = "Bestias";
            } else {
                System.out.println(
                        "\n**************************************************************************************");
                System.out.println(
                        "  Vamos a luchar todos los pueblos libres contra su amo oscuro, para perseverar la paz");
                System.out.println(
                        "****************************************************************************************");
                tempo = "Heroes";
            }

            System.out.println("\n---------------------------------");
            System.out.println("Presentando ejercito de " + tempo);
            System.out.println("---------------------------------\n");

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        } else {
            System.out.println("No hay un ejercito ");
        }
    }

    public void jugar() {
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("*** Bienvenido al juego del señor de los anillos: ***");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("\n");

        this.inicializarHeroes();
        this.inicializarBestias();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);

        System.out.println();
        System.out.println();
        System.out.println("*~~~~~~~~~~~~~~~~~~~*");
        System.out.println("  Empieza la batalla  ");
        System.out.println("*~~~~~~~~~~~~~~~~~~~*");
        System.out.println();
        this.pelea();

    }

    public void pelea() {
        ejercitoBestias[0].recibirAtaque(ejercitoHeroes[0]);
        ejercitoHeroes[0].recibirAtaque(ejercitoBestias[0]);
    }

    public void inicializarHeroes() {
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 2, 1, false);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new Humano("Humano " + Humano.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new Elfo("Elfo " + Elfo.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new Hobbit("Hobbit " + Hobbit.getInstancias());
                    break;
                default:
                    ejercitoHeroes[i] = new Elfo("Elfo " + Elfo.getInstancias());
                    break;
            }
        }
    }

    public void inicializarBestias() {
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 1, 1, false);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Trasgo("Trasgo " + Trasgo.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new Orco("Orco " + Orco.getInstancias());
                    break;
                default:
                    ejercitoBestias[i] = new Orco("Orco " + Orco.getInstancias());
                    break;
            }
        }
    }
}
