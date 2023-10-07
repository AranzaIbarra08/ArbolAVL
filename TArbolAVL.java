/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarbolavl;

/**
 *
 * @author Admin
 */
public class TArbolAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolAVL arbol= new ArbolAVL(178);
        ArbolAVL arbol2= new ArbolAVL(100);
        
        
        
        arbol.add(82);
        arbol.add(282); 
        arbol.add(-10); 
        arbol.add(23);
        arbol.add(120);
        arbol.add(113);
        arbol.add(278); 
        arbol.add(1083); 
        arbol.add(-100);
        arbol.add(1930);
        
        System.out.println(arbol.imprimeNiveles());
        
        arbol2.add(65); 
        arbol2.add(58); 
        arbol2.add(180);
        arbol2.add(-10);
        arbol2.add(120); 
        arbol2.add(105);
        arbol2.add(72); 
        arbol2.add(205);
        arbol2.add(23);
        arbol2.add(47);
        arbol2.add(-3);
        
        System.out.println(arbol2.imprimeNiveles());
        
        //insertar ya quedó alv ya todo cool con insertar 
        
        System.out.println(arbol.busca(-10));
        
        if(arbol2.busca(120))
            System.out.println("SI ESTÁ");
        else 
            System.out.println("NO ESTA");
        
          if(arbol2.busca(98373))
            System.out.println("SI ESTÁ");
        else 
            System.out.println("NO ESTA");
          
          arbol2.borra(65); 
        System.out.println(arbol2.imprimeNiveles());
        arbol.borra(178); 
        System.out.println(arbol.imprimeNiveles());
        
        System.out.println(arbol.imprimeinfo());

        
    }
    
  
            
    
}
