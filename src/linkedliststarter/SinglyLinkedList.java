/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList{
    private Node head;
    private Node tail;

    /**
     * Return the size of the Linked List
     * @return an int representing the size
     */
    @Override
    public int size() {
        int count = 1;
        while(head.getNext() != null){
            count++;
        }
        return count;
    }

    /**
     * Reset / Empty the LinkedList
     */
    @Override
    public void clear() {
        head = null;
        tail = null;    
    }

    /**
     * Remove the first instance of item from the linked list
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(Data item) {
        Node temp = head;
        for(int i = 0; i < size(); i++){ 
            if(temp.equals(item)){
                return remove(i); 
            }
            temp = temp.getNext();
        }
        
        return false;
        // Go through each of the items, if the item is equal to the one given as a paramater, get that one's index and call remove(index);
    }

    /**
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(int index) {
        if(index == 0){
            head = head.getNext();
            return true;
        } else if(index == size() - 1){
            
        }
        
        return false;
    }

    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Data item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    @Override
    public Data get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(String item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(String item, int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
