/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctofdowhile;

/**
 *
 * @author naomi
 */
public class CtoFDoWhile {


    public static void main(String[] args) {
     int c;
     double f;
       
     c=10;
     
     do 
     {
     f = (9*c + 160)/5;
     System.out.print( c + " - " + f + " \n ");
     c = c + 10;
     }while(c<110);
       
    }
    
}
