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
public class EDList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CList list = new CList(1);
        list.insert(2);
        list.insert(3);
        list.showList();
        list.showListbyAddress();
        list.deleteNode(2);
        list.showList();
        list.showListbyAddress();
        list.deleteList();
        list.showList();
        list.showListbyAddress();
        
    }
    
}
