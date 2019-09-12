/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoiterator;

/**
 *
 * @author jonas
 */
public class PadraoIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Padrão comportamental
        Com ele é possível iterar qualquer tipo de coleção de objetos (matrizes, listas...)
        */
        // Iteração sem utilizar o padrão
        Item[] itens = new Item[4];
        
        itens[0] = new Item("Vem pra cá.");
        itens[1] = new Item("É dinheiro ou não é?");
        itens[2] = new Item("O prêmio é em barras de ouro, que vale mais que dinheiroam.");
        itens[3] = new Item("É com você Lombardiam.");
        System.out.println("Iteração sem utilizar o padrão:");
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i].nome);
        }
        
        // Iteração com a utilização do padrão
        Item[] itens2 = new Item[4];
         
        itens2[0] = new Item("Em pé sem cair, deitado sem dormir, sentado sem cochilar e fazendo pose.");
        itens2[1] = new Item("A ordem dos tratores não altera o pão duris.");
        itens2[2] = new Item("Leite de capivaris, leite de mula manquis sem cabeça.");
        itens2[3] = new Item("Si num tem leite então bota uma pinga aí cumpadi!");
         
        ItemIterator iterator = new ItemIterator(itens2);
        System.out.println("\nIteração com a utilização do padrão:");
        while (iterator.hasNext()) {
            Item i = (Item)iterator.next();
            System.out.println(i.nome);
        }
    }
}
