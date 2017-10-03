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
public class Node <T>{
    T data;
    Node next;
    Node prev;
    public Node(T data){
        this.data=data;
        next = null;
        prev = null;
    }
}