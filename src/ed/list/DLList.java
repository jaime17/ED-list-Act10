/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list;

/**
 *
 * @author emiaj
 */
public class DLList <T> {
    Node first;
    Node last;
    Node pointer;
    int length;
    
    public DLList(){
        first = null;
        last = null;
        pointer = null;
        length = 0;
    }
    public DLList(T d){
        Node n = new Node(d);
        first = n;
        last = n;
        length++;
    }
    boolean isEmpty(){
        return length==0;
    }
    void insertFirst(T d){
        Node n = new Node(d);
        if(isEmpty()){
            first = n;
            last = n;
        }else{
            n.next= first;
            first.prev = n;
        }
        length++;
    }
    void insertLast(T d){
        Node n = new Node(d);
        if(isEmpty()){
            first = n;
            last = n;
        }else{
            n.prev = last;
            last.next = n;
            last = n;
        }
        length++;
    }
    void deleteFirst(){
        if(!isEmpty()){
            if(first.next == null){
                first = null;
                last = null;
            }else{
                first=first.next;
                first.prev = null;
            }
            length--;
        }
    }
    void deleteLast(){
        if (!isEmpty()){
            if (first.next == null){
                first = null;
                last = null;
            }else{
                pointer = first;
                while (pointer.next != last){
                    pointer = pointer.next;
                }
                last = pointer;
                last.next = null;
                pointer = null;
            }
            length--;
        }
    }
    void deleteNode(T d){
        pointer = first;
        Node n = new Node(d);
        if (!isEmpty()){
            if (first == last){
                if (first.data == d){
                    deleteFirst();
                }
            }else{
                if (first == last){
                    if (first.data == d){
                        deleteFirst();
                    }else{
                        pointer = first;
                        Node n2 = first.next.next;
                        while(pointer.next!=null){ 
                            if (pointer.next.data == n){
                                pointer.next = pointer.next.next;
                                n2 = n2.prev.prev;
                            }
                            pointer = pointer.next;
                            n2 = n2.next;
                        }
                    }
                }
            }
        }
    }
    
    void showSE(){
        pointer = first;
        System.out.print("first ->");
        for(int i = 0; i < length; i++){
            System.out.print("["+pointer.data+"]->");
            pointer = pointer.next;
        }
        System.out.print("<-last");
    }
    
    void showES(){
        pointer =last;
        System.out.println("last ->");
        for (int i = length; i > 0;i--){
            System.out.print("["+pointer.data+" ]->");
            pointer = pointer.prev;
        }
        System.out.println("<-first");
    }
}
