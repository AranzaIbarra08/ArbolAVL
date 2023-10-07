/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarbolavl;

/**
 *
 * @author Admin
 */
public class NodoAVL<T extends Comparable<T>> {
      private T elem;
    private NodoAVL<T> izq, der, papa;
    private int fe;
    
    public NodoAVL (T elem) {
        this.elem = elem;
        this.der = null;
        this.izq = null;
        this.papa = null;
        this.fe = 0;
    }

    
    public T getElem() {
        return elem;
    }

    
    public NodoAVL<T> getIzq() {
        return izq;
    }

    
    public NodoAVL<T> getDer() {
        return der;
    }
    
    public NodoAVL<T> getPapa(){
        return papa;
    }
   
    public int getFE(){
        return fe;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public void setIzq(NodoAVL<T> izq) {
        this.izq = izq;
    }

    public void setDer(NodoAVL<T> der) {
        this.der = der;
    }
    
    public void setPapa(NodoAVL<T> papa){
        this.papa = papa;
    }
    
    public void setFE(int fe){
        this.fe = fe;
    }

    //Metodo que "cuelga" un nodo hijo en el papá
    public void cuelga(NodoAVL<T> hijo){
        if (hijo == null)
            return;
        if (hijo.getElem().compareTo(elem)<= 0)
            izq = hijo;
        else
            der = hijo;
        hijo.setPapa(this);
    }
    
    @Override
    public String toString(){
        return this.elem.toString();
    }
    
}
