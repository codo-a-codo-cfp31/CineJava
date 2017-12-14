/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejavaapp.dao;

/**
 *
 * @author alumno
 * @param <L>
 * @param <R>
 */
public class Pair<L, R> {

    private L myType;
    private R myValue;

    public Pair(L myType, R myValue) {
        this.myType = myType;
        this.myValue = myValue;
    }

    public L getLeft() {
        return myType;
    }

    public R getRight() {
        return myValue;
    }

    @Override
    public int hashCode() {
        return myType.hashCode() ^ myValue.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair pairo = (Pair) o;
        return this.myType.equals(pairo.getLeft())
                && this.myValue.equals(pairo.getRight());
    }

    
    
    
}
