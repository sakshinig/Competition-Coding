import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String input = reader.nextLine();
    String[] abcList = input.split(" ");
    Integer[] abcListInt = new Integer[abcList.length];

    for (int i = 0; i < abcList.length; i++){
      abcListInt[i] = Integer.parseInt(abcList[i]);
    }
    ArrayList<Integer> abcInt = new ArrayList<Integer>(Arrays.asList(abcListInt));

    Collections.sort(abcInt);

    int a  = abcInt.get(0);
    int b =  abcInt.get(1);
    int c = abcInt.get(abcInt.size() -1) -a -b;

    System.out.println(a + " " + b + " " + c);

    
    //System.out.println(abcList);
    //for(int s : abcInt)
      //System.out.print(s + " ");

    
    
  }
}