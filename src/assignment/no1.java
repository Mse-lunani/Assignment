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
    boolean item= true;
    double total=0;
    while(item==true){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter price of item");
        double price = input.nextInt();
        double earn =0.07*price + 700;
        total+=earn;
        System.out.println("type true if you have a next item and false if you dont");
        item= input.nextBoolean();
        
    }
    System.out.println("total earning is: "+total);
}}
