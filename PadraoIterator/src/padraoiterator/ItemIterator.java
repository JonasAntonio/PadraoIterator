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
public class ItemIterator implements Iterator{

    Item[] itens;
    int posicao = 0;
     
    public ItemIterator(Item[] itens) {
        this.itens = itens;
    }
    
    @Override
    public Object next() {
        Item menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }
    
    @Override
    public boolean hasNext() {
        return !(posicao >= itens.length || itens[posicao] == null);
    }
}
