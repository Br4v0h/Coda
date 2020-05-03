
package coda.java;

public class CodaTest {

    public static void main(String[] args)
    {
        Coda C = new Coda();
        int value;


        System.out.printf("E' vuoto? %s\n", C.Vuoto() ? "Si" : "No");
        C.Stampa();
        System.out.println();

        C.aggiungere(7);

              System.out.printf("E' vuoto? %s\n", C.Vuoto() ? "Si" : "No");
        C.Stampa();
        System.out.println();

        C.aggiungere(4);

            System.out.printf("E' vuoto? %s\n", C.Vuoto() ? "Si" : "No");
        C.Stampa();
        System.out.println();

        C.aggiungere(9);

               System.out.printf("E' vuoto? %s\n", C.Vuoto() ? "Si" : "No");
        C.Stampa();
        System.out.println();

        C.aggiungere(5);

        System.out.printf("E' Vuoto? %s\n", C.Vuoto() ? "Si" : "No");
        C.Stampa();
        System.out.println();


        if (!C.Vuoto()) {
            value = C.togliere();
            System.out.printf("Element: %d\n", value);
        }
  
        System.out.printf("E' Vuoto? %s\n", C.Vuoto() ? "Si" : "No");
        C.Stampa();
        System.out.println();

        if (!C.Vuoto()) {
            value = C.togliere();
            System.out.printf("Element: %d\n", value);
        }
  
        System.out.printf("E' Vuoto? %s\n", C.Vuoto() ? "Si" : "No");
        C.Stampa();
        System.out.println();
    }
}
