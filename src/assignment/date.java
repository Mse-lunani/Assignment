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
public class date {
    int month;
    int date;
    int year;
 public date(int mnth,int dte,int yr){
     month= mnth;
     date= dte;
     year=yr;
   }
 public void set(int month1,int year1,int date1){
     month=month1;
     date=date1;
     year=year1;
 }
 public void displayMonth(){
      System.out.println(month+"/"+date+"/"+year);
 }
}
