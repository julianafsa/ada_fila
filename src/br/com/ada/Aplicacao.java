package br.com.ada;

public class Aplicacao {

    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.inserir(40);
        fila.inserir(50);
        fila.imprimir();

        fila.remover(); // remove o 10
        fila.imprimir();

        fila.remover(); // remove o 20
        fila.imprimir();

        fila.remover(); // remove o 30
        fila.imprimir();

        fila.remover(); // remove o 40
        fila.imprimir();

        fila.remover(); // remove o 50
        fila.imprimir();

        fila.remover(); // erro
        fila.imprimir();

        fila.inserir(60);
        fila.imprimir();

    }

}
