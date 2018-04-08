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
public class array {
    public void Array(){
        int count [][]= new int[2][5];
        for(int j=0;j<2;j++){
        for(int i=0;i<4;i++){
            count[j][i]=0;
            count[j][i]=+1;
            System.out.print("\t"+count[j][i]);
            
        }
        System.out.println();
        }
        
    }
}
