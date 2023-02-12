import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String input = reader.nextLine();
    String[] lineOne = input.split(" ");
    Integer[] lineOneIntArr = new Integer[lineOne.length];

    for (int i = 0; i < lineOne.length; i++){
      lineOneIntArr[i] = Integer.parseInt(lineOne[i]);
    }
    ArrayList<Integer> lineOneInt = new ArrayList<Integer>(Arrays.asList(lineOneIntArr));

    int max = lineOneInt.get(1);

    input = reader.nextLine();
    String[] lineTwo = input.split(" ");
    Integer[] lineTwoIntArr = new Integer[lineTwo.length];

    for (int j = 0; j < lineTwo.length; j++){
      lineTwoIntArr[j] = Integer.parseInt(lineTwo[j]);
    }
    ArrayList<Integer> lineTwoInt = new ArrayList<Integer>(Arrays.asList(lineTwoIntArr));

    Collections.sort(lineTwoInt);
    int sum = 0;
    int count =0;
    for (int k : lineTwoInt){
      if ((sum + k) <= max){
        sum += k;
        count++;
      }
      else{
        break;
      }
    }
    
    System.out.println(count);

  }
}