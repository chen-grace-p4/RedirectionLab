import java.util.*;
import java.io.*;

public class MakeStars {

  public static void main(String[]args) {
    Scanner in = new Scanner( System.in );

    while (in.hasNext()) {
      String line = in.nextLine();
      Scanner wordScan = new Scanner(line);

      while (wordScan.hasNext()) {
        String word = wordScan.next();
        for (int i = 0; i < word.length(); i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }

      System.out.println();
    }

  }

}
