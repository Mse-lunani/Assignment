/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author LENOVO V310
 */
public class no1 {
    public void item(){
    boolean item= false;
    double total=400;
    Scanner input= new Scanner(System.in);
    System.out.println("type true if you have a next item and false if you dont");
    item= input.nextBoolean();
    while(item==true){
        
        System.out.println("Enter itemNumber");
        double item_no = input.nextInt();
        if(item_no==1){
         System.out.println("Enter Number of items");  
         int no_items=input.nextInt();
        double earn =259.34*no_items;
        total+=earn;
        }
        else if(item_no==2){
         System.out.println("Enter Number of items");  
         int no_items=input.nextInt();
        double earn =0.07*349.75*no_items + 400;
        total+=earn;
        }
         else if(item_no==3){
        System.out.println("Enter Number of items");  
         int no_items=input.nextInt();
        double earn =100.95*no_items ;
        total+=earn;
        }
         else if(item_no==4){
        System.out.println("Enter Number of items");  
         int no_items=input.nextInt();
        double earn =300.89*no_items ;
        total+=earn;
        }
        System.out.println("type true if you have a next item and false if you dont");
        item= input.nextBoolean();
        
    }
    System.out.println("total earning is: "+total*0.07+400);
}}
