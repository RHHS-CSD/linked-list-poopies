/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class LinkedListStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is a shared space for you to do some testing  It will also likely be the source of lots of conflicts if you're not careful.
        SinglyLinkedList sli1 = new SinglyLinkedList();
        sli1.add("Mr.Peters POOP 5");
        sli1.add("Mr.RD ICS4U1 4", 0);
        sli1.add("Mr.RD2 ICS4U1 4", 9);
        Data d = new Data("Mr.Peters","POOP",5);
        sli1.remove(d);
        sli1.remove(1);
        System.out.println(sli1.size());
        System.out.println(sli1.toString());
        
        
        
    }
    
}
