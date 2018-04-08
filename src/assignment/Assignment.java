/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author LENOVO V310
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       no1 nn= new no1();
        nn.item();
        //assume this application is called date for question two coz am just too lazy to create a new packge right now
        date Date= new date(5,5,5);
        Date.set(6, 1998, 2);
        Date.displayMonth();
    }
    
}
