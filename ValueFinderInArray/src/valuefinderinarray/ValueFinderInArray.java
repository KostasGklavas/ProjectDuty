
package valuefinderinarray;

import java.util.Scanner;


public class ValueFinderInArray {
    static int num;
    static boolean ValueFinder(int [] array){
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==num)
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int [] array = {5,6,8,0,123,34,5,6,7,1122};
            while(num!=-1){
              System.out.println("Enter asked number : ");
              Scanner keyb = new Scanner(System.in);
              num = keyb.nextInt();
              if(ValueFinder(array)== true)
              {
                  System.out.println("FOUND");
                  
              }
              else
              {
                  System.out.println("Not Found");
              }
            }
        
              
    }
    
}
