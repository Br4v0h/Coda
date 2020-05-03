
package coda.java;

public class Coda {
    private Nodo head;
    private Nodo tail;
    private int cont;

    public Coda() {
        this.cont = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean Vuoto() {
        return this.cont == 0;
    }

    public int size() {
        return this.cont;
    }

    public void Stampa()
    {
        Nodo cont = this.head;

        System.out.printf("[%d] ", this.size());

        while (cont != null) {
            System.out.printf("%d ---> ", cont.valore);
            cont = cont.next;
        }
        System.out.printf("NULL\n");
    }

    public void aggiungere(int val)
    {
        Nodo temp = new Nodo(val);

        this.cont++;

        if (this.head == null) {
            this.head = temp;
        } else {
            this.tail.next = temp;
        }

        this.tail = temp;
    }

    public int togliere()
    {
        int value;

        value = this.head.valore;

        this.head = this.head.next;

        if (this.head == null) {
            this.tail = null;
        }

        this.cont--;

        return value;
    }
};

