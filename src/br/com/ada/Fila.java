package br.com.ada;

public class Fila {

    private int fila[];
    private int tamanho = 0;
    private int inicio = 0;
    private int fim = 0;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.fila = new int[tamanho];
        this.inicio = 0;
        this.fim = 0;
    }

    // TODO Fazer fila sem perder a quantidade de elementos dela
    public void inserir(int elemento) {
        if (fim < tamanho) {
            System.out.println("Inserindo elemento " + elemento + " na posicao " + fim);
            fila[fim] = elemento;
            fim++;
        }
    }

    // TODO Retornar o elemento que está sendo removido
    public void remover() {
        int elementoRemovido;
        if (inicio < fim) {
            elementoRemovido = fila[inicio];
            System.out.println("Removendo elemento " + elementoRemovido + " da posicao " + inicio);
            inicio++;
            if (inicio == fim) {
                this.reiniciar();
            }
        }
        else {
            System.out.println("Fila vazia. Não pode remover mais nenhum elemento.");
        }

    }

    public void imprimir() {
        for (int i = inicio; i < fim; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println("\n");
    }

    private void reiniciar() {
        inicio = 0;
        fim = 0;
    }
}
