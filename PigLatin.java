import java.util.*;
import java.io.*;

public class PigLatin {
  public static String pigLatinSimple(String s) {
    Scanner in = new Scanner( System.in );

    while (in.hasNext()) {
      String line = in.nextLine();
      Scanner wordScan = new Scanner(line);

      while (wordScan.hasNext()) {
        String word = wordScan.next();
        if (word.substring(0,1)) {

        }
      }

      System.out.println();
    }
  }
}
