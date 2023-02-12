import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class S {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int testcount = read.nextInt();
    for (int i = 1; i <= testcount; i++){
      int listSize = read.nextInt();
      System.out.println("this works");
      String inputstr = read.nextLine();
      String[] input = inputstr.split(" ");
      
      Integer[] intInput = new Integer[listSize];
      
      for (int q = 0; q < listSize; q++){
        
        intInput[q] = (Integer.parseInt(input[q]));
      }
      
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(intInput));
      int sum = 0;
      for (Integer k : array)
        sum += k;
      if (sum % 2 == 0){
        System.out.println(0);
      }
      else{
        ArrayList<Integer> counts = new ArrayList<Integer>();
        
        for (Integer j : array){
          
          if (j % 2 == 0){
            int num = 0;
            while(j % 2 == 0){
              
              j /= 2;
              num +=1;
              //System.out.println(j);
            }
            counts.add(num);
            
          }
          else{
            int num = 0;
            while(j % 2 == 1){
              j /= 2;
              num +=1;
              
            } 
            counts.add(num);
            
          }
          
        }
        //System.out.println(counts.toString());
        int min = counts.get(0);
        for (int t = 1; t < listSize; t++) {
            if (min > counts.get(t))
                min = counts.get(t);
        } 
        System.out.println(min);
      }
    }
  }
}