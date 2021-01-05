import java.util.*;
import java.io.*;

public class PigLatin {
  public static String pigLatinSimple(String s) {
    String word = s.toLowerCase();
    if (word.substring(0,1).equals("a") || word.substring(0,1).equals("e") || word.substring(0,1).equals("i") || word.substring(0,1).equals("o") || word.substring(0,1).equals("u")) {
      word += "hay";
    }
    else {
      String first = word.substring(0,1);
      word = word.substring(1,word.length()) + first + "ay";
    }
    return word;
  }

  public static String pigLatin(String s) {
    s = s.toLowerCase();
    String[] dictlist = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    List<String> dict = Arrays.asList(dictlist);

    if (dict.contains(s.substring(0,2))) {
      s = s.substring(2,s.length()) + s.substring(0,2) + "ay";
    } else {
      s = pigLatinSimple(s);
    }
    return s;
  }

  public static String pigLatinBest(String s){
    char first = s.charAt(0);
    if ( (first < 65) || (first > 90 && first < 97) || (first > 122)) {
      return s;
    }

    char last = s.charAt(s.length()-1);
    if ( (last < 48) || (last > 57 && last < 65) || (last > 90 && last < 97) || (last > 122)) {
      String word = s.substring(0, s.length()-1);
      s = pigLatin(word) + last;
      return s;
    }

    return pigLatin(s);
  }
}
