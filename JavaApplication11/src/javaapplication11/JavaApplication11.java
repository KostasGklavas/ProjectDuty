/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author KOSTAS
 */
public class JavaApplication11 {

   static int num,initialnum,temp;
   
    public static void main(String[] args) {
        int [] arr = new int [100];
            System.out.println("Enter initial number to store : ");
              Scanner keyb1 = new Scanner(System.in);
              initialnum = keyb1.nextInt();
              arr[0]=initialnum;
              temp=arr[0];
            while(num!=-1)
            {
           
              
              for(int i=0;i<arr.length;i++)
              {
                System.out.println("Enter number to store : ");
                Scanner keyb = new Scanner(System.in);
                num = keyb.nextInt();
                if(num<temp)
                {
                    arr[i]=num;
                    temp=num;
                }
                else
                      System.out.println("Not Stored");
              }
              
              
            }
            
    }
    
}
