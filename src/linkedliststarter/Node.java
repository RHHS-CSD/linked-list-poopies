/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Node {
    private Data data = null;
    private Node next = null;
    
    public Node(Data insert){
        data = insert;
    }
    
    public void setData(Data d){
        
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node n){
        next = n;
    }
}
