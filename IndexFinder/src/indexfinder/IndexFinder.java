
package indexfinder;

import java.util.Scanner;


public class IndexFinder {

     static int num,display_num;
     static int IndexFinder(int [] array){
         for(int i = 0;i<array.length;i++)
         {
             if(array[i]==num)
             {
                 return i;
             }
            
         }
         return -100;
     }
    public static void main(String[] args) {
        int [] array = {5,6,8,0,123,34,5,6,7,1122};
        while(num!=-1)
        {
               System.out.println("Enter asked number : ");
              Scanner keyb = new Scanner(System.in);
              num = keyb.nextInt();
              display_num = IndexFinder(array);
              if(display_num==-100)
                  System.out.println("Not found");
              else
              System.out.println("position of " +num + " in the array is found at " + display_num);
              
        }
    }
    
}
