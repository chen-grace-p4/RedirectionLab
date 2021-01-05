import java.util.*;
import java.io.*;

public class PigLatin {
  public static String pigLatinSimple(String s) {
    String word = s;

    if (word.substring(0,1).equals("a") || word.substring(0,1).equals("e") || word.substring(0,1).equals("i") || word.substring(0,1).equals("o") || word.substring(0,1).equals("u")) {
      word += "hay";
    }
    else {
      String first = word.substring(0,1);
      word = word.substring(1,word.length()) + first + "ay";
    }

    return word;

  }
}
