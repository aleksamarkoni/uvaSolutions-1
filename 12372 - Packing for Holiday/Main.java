import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int numCase = in.nextInt();
    int counter = 0;
    int L;
    int W;
    int H;
    int printCounter = 0;
    String print = "";


    while(counter < numCase){

    L = in.nextInt();
    W = in.nextInt();
    H = in.nextInt();

    if (L <= 20 && W <= 20 && H <= 20) {
        print = "good";
    } else if (L > 20 || W > 20 || H > 20) {
        print = "bad";
    }
     printCounter++;
     System.out.println("Case " + printCounter + ": " + print);
     counter++;
    }
  }
}
